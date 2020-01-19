package com.example.SingletonPattern;

import java.io.*;

/**
 * 测试序列化破坏单例
 * @auther ZhangHan
 * @date 2020/1/14 19:15
 */
public class SeriableSingletonTest {

    public static void main(String[] args) {
        SeriableSingleton s1 = null;
        SeriableSingleton s2 = SeriableSingleton.getInstance();

        FileOutputStream fos = null;

        try {
            //创建文件输出流
            fos = new FileOutputStream("SeriableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //持久化
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            //文件输入流
            FileInputStream fis = new FileInputStream("SeriableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            //读取对象
            s1 = (SeriableSingleton)ois.readObject();
            //关闭
            ois.close();

            //验证
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2); //false
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
