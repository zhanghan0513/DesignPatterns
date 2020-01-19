package com.example.SingletonPattern;

import java.lang.reflect.Constructor;

/**
 * 使用反射破坏单例
 * @auther ZhangHan
 * @date 2019/12/18 22:04
 */
public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {
        try {
            Class<?> clazz = LazyInnerClassSingleton.class;
            //通过反射获取私有构造方法
            Constructor constructor = clazz.getDeclaredConstructor();
            //强制访问
            constructor.setAccessible(true);
            //初始化
            Object o1 = constructor.newInstance();
            //调用了两次构造方法，new了两次。
            Object o2 = constructor.newInstance();
            System.out.println(o1 == o2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
    通过在LazyInnerClassSingleton私有构造方法中加了限制，自以为史上最牛的单例模式的实现已经大功告成
     */
}
