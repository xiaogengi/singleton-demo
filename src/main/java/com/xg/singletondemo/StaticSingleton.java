package com.xg.singletondemo;

import java.io.Serializable;

/**
 * @program: singleton-demo
 * @description: 静态单例
 * @author: gzk
 * @create: 2019-11-12 15:18
 **/

public class StaticSingleton implements Serializable {


    private StaticSingleton(){
        if(BigSingleton.STATIC_SINGLETON != null){
            throw new ClassCastException("该类不允许构造");
        }
    }

    private Object readResolve(){
        return BigSingleton.STATIC_SINGLETON;
    }

    public static StaticSingleton info(){
        return BigSingleton.STATIC_SINGLETON;
    }

    private static class BigSingleton{
        private static final StaticSingleton STATIC_SINGLETON = new StaticSingleton();
    }


}
