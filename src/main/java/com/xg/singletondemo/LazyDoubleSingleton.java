package com.xg.singletondemo;

/**
 * @program: singleton-demo
 * @description: 双重判定锁
 * @author: gzk
 * @create: 2019-11-12 15:14
 **/

public class LazyDoubleSingleton {

    private LazyDoubleSingleton(){}

    private static LazyDoubleSingleton singleton = null;

    public static LazyDoubleSingleton info(){
        if(singleton == null){
            synchronized (LazyDoubleSingleton.class){
                if(singleton == null){
                    singleton = new LazyDoubleSingleton();
                    System.out.println(singleton);
                }
            }
        }
        return singleton;
    }


}
