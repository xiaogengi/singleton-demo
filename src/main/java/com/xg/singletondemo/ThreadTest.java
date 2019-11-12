package com.xg.singletondemo;

/**
 * @program: singleton-demo
 * @description: 线程
 * @author: gzk
 * @create: 2019-11-12 14:57
 **/

public class ThreadTest implements Runnable {
    @Override
    public void run() {
//        懒汉式
//        LazySimpleSingleton info = LazySimpleSingleton.info();

//        饿汉式
//        HungrySimpleSingleton info = HungrySimpleSingleton.info();

//        静态内部类
//        StaticSingleton info = StaticSingleton.info();

//        双重判定锁
//        LazyDoubleSingleton info = LazyDoubleSingleton.info();

        ThreadLocalSingleton info = ThreadLocalSingleton.info();
        System.out.println(Thread.currentThread().getName() +" : "+ info);
    }
}
