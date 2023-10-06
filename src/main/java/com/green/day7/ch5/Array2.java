package com.green.day7.ch5;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int[] arr1 = {100, 200}; // 레퍼런스 타입은 주소 값이 저장된다.
        int[] arr2 = {5, 10, 15};

//        for (int i = 0; i < arr1.length; i++) {
//            System.out.printf("arr1[%d] = {%d}\n", i, arr1[i]);
//        }

        arr1 = arr2; // 얕은 복사: 같은 주소 값을 참조한다.
        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr2 = " + Arrays.toString(arr2));

//        System.out.println("========================================");
//
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.printf("arr1[%d] = {%d}\n", i, arr1[i]);
//        }
//
//        System.out.println("||||||||||||||||||||||||||||||||||||||||");
//
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.printf("arr2[%d] = {%d}\n", i, arr2[i]);
//        }

        System.out.printf("arr1 == arr2 = {%s}", arr1 == arr2);
    }

}
