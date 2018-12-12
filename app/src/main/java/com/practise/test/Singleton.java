package com.practise.test;

/**
 * Created by s on 2018/12/12.
 */

public class Singleton {
    //创建一个实例对象
    private static Singleton singleton = new Singleton();

    private Singleton(){
    }

    //获取唯一可用的对象
    public static Singleton getSingleton(){
        return singleton;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
