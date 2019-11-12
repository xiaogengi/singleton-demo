package com.xg.singletondemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @program: singleton-demo
 * @description: 反序列化测试
 * @author: gzk
 * @create: 2019-11-12 15:40
 **/

public class SeriazableSIngletonTest {

    public static void main(String[] args) {
        StaticSingleton s1 = null;
        StaticSingleton s2 = StaticSingleton.info();
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("StaticSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();
            FileInputStream fis = new FileInputStream("StaticSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (StaticSingleton)ois.readObject();
            ois.close();
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




}
