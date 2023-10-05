package com.green.day7.ch5;

import java.util.Arrays;

public class Array3Mission {
    public static void main(String[] args) {
        // 문제1
//        int[] arr1 = {5, 10, 15};
//        int[] arr2 = new int[4];
//        int[] arr3 = new int[4];
//
//        arr3[3] = 20;
//
//        for(int i = 0; i < arr1.length; i++) {
//            arr2[i] = arr1[i];
//            arr3[i] = arr1[i];
//        }
//
//        System.out.println("arr1 = " + Arrays.toString(arr1) + "\narr2 = " + Arrays.toString(arr2) + "\narr3 = " + Arrays.toString(arr3));

        // 문제2
        int[] arr1 = {5, 10, 15, 7, 1};
        int[] arr2 = new int[arr1.length + 1];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        arr2[arr1.length] = 20;

        System.out.println("arr2 = " + Arrays.toString(arr2));
    }
}
