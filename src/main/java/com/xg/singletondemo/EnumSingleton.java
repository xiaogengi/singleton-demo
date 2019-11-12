package com.xg.singletondemo;

/**
 * @program: singleton-demo
 * @description: 枚举
 * @author: gzk
 * @create: 2019-11-12 15:48
 **/

public enum  EnumSingleton {

    INSTANCE;

    private Object data;

    public Object getData(){
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton info(){
        return INSTANCE;
    }


}
