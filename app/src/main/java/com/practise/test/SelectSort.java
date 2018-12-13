package com.practise.test;

/**
 * Created by s on 2018/12/12.
 */

public class SelectSort {
    public static void main(String[] main) {
        int[] number = {5, 6, 3, 13, 4};
		//测试
        for (int i = 0; i < number.length; i++) {
            int min = i;
            for (int j = i; j < number.length; j++) {
                if (number[j] < number[min]){
                    min = j;
                }
                int temp = number[min];
                number[min] = number[i];
                number[i] = temp;
            }
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + ", ");

        }
    }
}
