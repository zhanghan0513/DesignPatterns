package com.example.SingletonPattern;

/**
 * 双重检测
 * @auther ZhangHan
 * @date 2019/12/18 21:47
 */
public class LazyDoubleCheckSingleton {
    private static LazyDoubleCheckSingleton instance = null;

    private LazyDoubleCheckSingleton(){}

    public static LazyDoubleCheckSingleton getInstance(){
        if(instance == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(instance == null){
                    instance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
