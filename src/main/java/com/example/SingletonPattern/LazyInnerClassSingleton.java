package com.example.SingletonPattern;

/**
 * 使用synchronized关键字总归要上锁，对性能还是存在一定的影响。
 * 我们可以从类初始化的角度来考虑（静态内部类）
 * @auther ZhangHan
 * @date 2019/12/18 21:52
 */
public class LazyInnerClassSingleton {
    /*
    使用LazyInnerClassSingleton的时候，默认会先初始化内部类
    如果没有使用，则内部类是不加载的
     */
    private LazyInnerClassSingleton(){
        //通过LazyInnerClassSingletonTest 反射创建了两个不同的实例。做一些限制
        if(LazyHolder.LAZY != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    /*
    每一个关键字都不是多余的。
    static是为了使单例的空间共享
    final保证这个方法不会被重写、重载
     */
    public static final LazyInnerClassSingleton getInstance(){
        //在返回结果以前，一定会先加载内部类
        return LazyHolder.LAZY;
    }

    /**
     * 静态内部类
     * 默认不加载
     */
    private static class LazyHolder{
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }

    /*
    这种方式兼顾了饿汉式单例模式的内存浪费问题和synchronized的性能问题。
    内部类一定是要在方法调用前初始化，巧妙地避免了线程安全问题。
     */
}
