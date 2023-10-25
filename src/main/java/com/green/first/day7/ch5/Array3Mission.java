package com.green.first.day7.ch5;

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

        // 배열명.length - 1: 길이(length)의 마지막 번호에서 '-1'하면 마지막 인덱스를 가져올 수 있다.(인덱스는 '0'부터 시작하기 때문에)
        arr2[arr2.length - 1] = 20;

        System.out.println("arr2 = " + Arrays.toString(arr2));
    }
}
