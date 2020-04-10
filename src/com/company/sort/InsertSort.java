package com.company.sort;

import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] array = {8,4,3,9,31,2,1,10,21};
       // selectSort(array);
        insertSort1(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 插入排序
     * @param array
     */
    public static void insertSort1(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i], j;
            for (j = i - 1; j >= 0 && key < array[j]; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = key;
        }
    }

    /**
     * 二叉插入排序
     * @param array
     */
    public static void insertSort2(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int L = 0, R = array.length - 1;
            while (L <= R) {
                int mid = L + (R - L) / 2;
                if (array[mid] > key)
                    R = mid - 1;
                else
                    L = mid + 1;
            }
            for (int j = i - 1; j >= L; j--)
                array[j+1] = array[j];
            array[L] = key;
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
