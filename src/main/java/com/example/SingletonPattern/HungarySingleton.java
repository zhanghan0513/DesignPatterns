package com.example.SingletonPattern;

/**
 * 单例模式 饿汉式
 * @auther ZhangHan
 * @date 2019/12/18 21:28
 */
public class HungarySingleton {
    /**
     * 先静态、后动态
     * 先属性、后方法
     * 先上后下
     */
    private static final HungarySingleton instance = new HungarySingleton();

    private HungarySingleton(){}

    public static HungarySingleton getInstance(){
        return instance;
    }
}
