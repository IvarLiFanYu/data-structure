package com.company.sort;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {
        int[] arr = {9,2,4,5,10,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        //1. 建立大顶堆
        // arr.length/2 -1 最后一个非叶子结点
        for (int i = arr.length/2 - 1; i >= 0; i--) {
          adjustHeap(arr, i, arr.length);
        }
        //2. 交换首尾元素, 并调整堆结构
        for (int j = arr.length - 1; j > 0; j--) {
            // 交换首尾元素
            swap(arr, 0, j);
            // 重新调整堆为大顶堆
            adjustHeap(arr, 0, j);
        }
    }

    /**
     * 调整大顶堆(建立在大顶堆的基础上)
     * @param arr       要调整的数组
     * @param i
     * @param length    要交换的元素的个数
     */
    private static void adjustHeap(int[] arr, int i, int length) {
        //取出当前元素
        int temp = arr[i];
        for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {
            if (k + 1 < length && arr[k] < arr[k + 1]) {
                k++;
            }
            if (arr[k] > temp) {
                arr[i] = arr[k];
                i = k;
            } else {
                break;
            }
        }
        //将 temp 放到最终位置
        arr[i] = temp;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
