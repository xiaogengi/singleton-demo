package com.xg.singletondemo;

import java.io.Serializable;

/**
 * @program: singleton-demo
 * @description: 反序列化
 * @author: gzk
 * @create: 2019-11-12 15:38
 **/

public class SeriazableSingleton implements Serializable {


    private SeriazableSingleton(){}

    private static final SeriazableSingleton singleton = new SeriazableSingleton();

    public static SeriazableSingleton info(){
        return singleton;
    }


//
    private Object readResolve(){
        return singleton;
    }


}
