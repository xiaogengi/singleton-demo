package com.xg.singletondemo;

/**
 * @program: singleton-demo
 * @description: 懒汉式
 * @author: gzk
 * @create: 2019-11-12 14:53
 **/

public class LazySimpleSingleton {


    private LazySimpleSingleton(){}


    private static LazySimpleSingleton lazy = null;

    public static LazySimpleSingleton info(){
        if(lazy == null){
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }



}
