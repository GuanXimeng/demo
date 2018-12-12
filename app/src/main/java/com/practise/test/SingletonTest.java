package com.practise.test;

/**
 * Created by s on 2018/12/12.
 */

public class SingletonTest {
    public static void main(String[] arg) {
        Singleton singleton = Singleton.getSingleton();
        singleton.showMessage();
    }
}
