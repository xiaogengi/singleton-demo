package com.xg.singletondemo;

/**
 * @program: singleton-demo
 * @description: 饿汉式
 * @author: gzk
 * @create: 2019-11-12 15:07
 **/

public class HungrySimpleSingleton {

    private HungrySimpleSingleton(){}

    private static final HungrySimpleSingleton singleton = new HungrySimpleSingleton();

    public static HungrySimpleSingleton info(){
        return singleton;
    }


}
