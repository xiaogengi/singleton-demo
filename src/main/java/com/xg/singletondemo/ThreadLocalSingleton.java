package com.xg.singletondemo;

/**
 * @program: singleton-demo
 * @description: 线程单例
 * @author: gzk
 * @create: 2019-11-12 15:52
 **/

public class ThreadLocalSingleton {


    private static final  ThreadLocal<ThreadLocalSingleton> thread = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton(){};

    public static ThreadLocalSingleton info(){
        return thread.get();
    }




}
