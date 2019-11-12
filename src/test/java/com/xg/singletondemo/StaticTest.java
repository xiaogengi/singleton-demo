package com.xg.singletondemo;

/**
 * @program: singleton-demo
 * @description: 静态类执行顺序
 * @author: gzk
 * @create: 2019-11-12 16:23
 **/

public class StaticTest {

    public static void main(String[] args) {
        new StaticTest();
    }

    static {
        System.out.println("test 静态块");
    }


    private StaticTest(){
        System.out.println("StaticTest");
    }

    private static class Sta{
        static {
            System.out.println("sta 静态块");
        }
    }



}
