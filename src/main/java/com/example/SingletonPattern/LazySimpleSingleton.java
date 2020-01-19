package com.example.SingletonPattern;

/**
 * 单例模式 懒汉式
 * 被外部类调用的时候内部类才会加载。
 * @auther ZhangHan
 * @date 2019/12/18 21:34
 */
public class LazySimpleSingleton {
    private static LazySimpleSingleton instance = null;

    private LazySimpleSingleton(){}

    /**
     * 在没加入synchronized之前，Test类中返回的是两条实例。
     * @return
     */
    public synchronized static LazySimpleSingleton getInstance(){
        if(instance == null){
            instance = new LazySimpleSingleton();
        }
        return instance;
    }
}
