package com.company.sort;

import java.util.Arrays;

/**
 * 冒泡排序 :
 *      平均情况 	   最好情况 	    最坏情况 	空间 	  稳定性
 *      O(n^2) 	       O(n) 	    O(n^2) 	    O(1) 	  稳定
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {8,4,3,9,2,1};
        //bubbleSort01(array);
        //bubbleSort3(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 初始的冒泡排序
     *
     *        平均情况 	   最好情况 	    最坏情况 	空间 	  稳定性
     *        O(n^2) 	    O(n) 	    O(n^2) 	    O(1) 	  稳定
     *
     */
    public static void bubbleSort01(int[] array) {
        //如果在一次比较的过程中没有任何元素发生变化,则表示数组已排好序.
        boolean isSort = false;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]) {
                    swap(array, j, j+1);
                    isSort = true;
                }
            }
            if (!isSort) {
                break;
            }
        }
    }

    /**改进的冒泡排序(鸡尾酒排序)  就是把最大的数往后面冒泡的同时, 最小的数也往前面冒泡*/
    public static void bubbleSort3(int[] array) {
        int L = 0;
        int R = array.length - 1;
        boolean isSort = false;
        while (L < R) {
            for (int i = L; i < R; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i+1);
                    isSort = true;
                }
            }
            R--;
            for (int i = R; i > L; i--) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    isSort = true;
                }
            }
            L++;
            if (!isSort)    break;
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
