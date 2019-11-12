package com.xg.singletondemo;

/**
 * @program: singleton-demo
 * @description: 懒汉式测试
 * @author: gzk
 * @create: 2019-11-12 14:58
 **/

public class LazySimpleSingletonTest {


    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.info());
        System.out.println(ThreadLocalSingleton.info());
        System.out.println(ThreadLocalSingleton.info());
        System.out.println(ThreadLocalSingleton.info());

        System.out.println("=============================");
        Thread t = new Thread(new ThreadTest());
        Thread t2 = new Thread(new ThreadTest());
        t.start(); t2.start();
    }


//    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        Class<StaticSingleton> clazz = StaticSingleton.class;
//        Constructor<StaticSingleton> de = clazz.getDeclaredConstructor(null);
//        //强制访问构造方法
//        de.setAccessible(true);
//
//        System.out.println(de.newInstance());
//        System.out.println(de.newInstance());
//    }


}
