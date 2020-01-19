package com.example.SingletonPattern;

import java.io.Serializable;

/**
 * 一个单例对象创建好后，有时需将对象序列化到磁盘，下次使用再从磁盘中读取对象进行反序列化，将其转化为内存对象。
 * 反序列化后的对象重新分配内存（重新创建）。、
 * 如果序列化的目标对象为单例对象，就违背了单例模式的初衷。破坏了单例
 *
 * @auther ZhangHan
 * @date 2020/1/14 19:06
 */
public class SeriableSingleton implements Serializable {
    /*
    序列化就是把内存中的对象通过转换成字节码的形式，从而转换一个I/O流，写入其他的地方（磁盘，网络I/O）
    内存中的对象会永久保存下来

    饭序列化就是将已经持久化的字节码内容转换为I/O流，通过I/O流的读取，将读取的内容转换成Java对象
    在转换的过程中会重新创建对象（new）
     */

    private SeriableSingleton(){}

    private static final SeriableSingleton INSTANCE = new SeriableSingleton();

    public static SeriableSingleton getInstance(){
        return INSTANCE;
    }

    /**
     * 从SeriableSingletonTest测试类结果中可以看到，反序列化后的对象与手动创建的对象不一致，创建了两次。
     * 如何保证在序列化的情况下也能够实现单例？
     * 只需要添加 readResolve()方法即可。
     */
    private Object readResolve(){
        return INSTANCE;
    }
}
