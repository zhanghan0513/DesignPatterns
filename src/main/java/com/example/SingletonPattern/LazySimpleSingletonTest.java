package com.example.SingletonPattern;

/**
 * @auther ZhangHan
 * @date 2019/12/18 21:38
 */
public class LazySimpleSingletonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + ":" + singleton);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + ":" + singleton);
            }
        });

        t1.start();
        t2.start();
        System.out.println("End");
    }
}
