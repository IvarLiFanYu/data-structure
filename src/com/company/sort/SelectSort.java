package com.company.sort;

import java.util.Arrays;

/**
 * 选择排序
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] array = {8,4,3,9,31,2,1,10,21};
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }

    //选择排序
    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j <= array.length - 1; j++) {
                if (array[max] < array[j]) {
                    max = j;
                }
            }
            swap(array, max, i);
        }
    }

    /**
     * 交换数组中的两个数字
     * @param array
     * @param j
     * @param i
     */
    private static void swap(int[] array, int j, int i) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
