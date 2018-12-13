package com.practise.test;

/**
 * Created by s on 2018/12/12.
 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 3, 4};
        boolean flag;//是否交换的标志
        for (int i = 0; i < array.length - 1; i++) {
            flag = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
            for (int k = 0; k < array.length; k++) {
                System.out.print(array[k] + ", ");
            }
        }

    }
}
