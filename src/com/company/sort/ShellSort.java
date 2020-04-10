package com.company.sort;

import java.util.Arrays;

/**
 * 希尔排序
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] array = {8,4,3,9,31,2,1,10,21};
        shellSort1(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 步长为 n/2
     * @param array
     */
    public static void shellSort1(int[]  array) {
        //循环进行分组并在组内进行插入排序
        for (int gap = array.length; gap > 0; gap /= 2) {
            //从第 gap 个元素开始排序
            for (int i = gap; i < array.length; i++) {
                //每个组内进行插入排序
                int key = array[i], j;
                for (j = i - gap; j >= 0 && key < array[j]; j -= gap) {
                    array[j+gap] = array[j];
                }
                array[j+gap] = key;
            }
        }
    }

}
