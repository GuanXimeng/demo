package com.practise.test;

/**
 * Created by s on 2018/12/12.
 */

public class TestActivity1 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            //百位
            int j = i / 100;
            //十位
            int k = i % 100 /10;
            //个位
            int m = i % 10;
            if (i == j*j*j +k*k*k+m*m*m){
                System.out.println("水仙花数为："+i);
            }
        }
    }
}
