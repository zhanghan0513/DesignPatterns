package com.example.SingletonPattern;

/**
 * 单例模式 饿汉式静态块
 * @auther ZhangHan
 * @date 2019/12/18 21:32
 */
public class HungaryStaticSingleton {
    private static final HungaryStaticSingleton instance;
    static{
        instance = new HungaryStaticSingleton();
    }
    private HungaryStaticSingleton(){}
    public static HungaryStaticSingleton getInstance(){
        return instance;
    }
}
