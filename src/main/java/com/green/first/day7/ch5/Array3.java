package com.green.first.day7.ch5;

public class Array3 {
    public static void main(String[] args) {
        int[] arr1 = {5, 10, 15};
        int[] arr2 = new int[arr1.length]; // arr1 길이 만큼의 배열을 생성한다.(index 길이 초기화 O, 값 초기화 X)
        String[] food = {"간짜장", "볶음밥", "국물 닭발"};
        String[] arr3 = new String[arr1.length];

//        for (int i = 0; i < arr1.length; i++) {
//            arr2[i] = arr1[i];
//        }
//
//        arr2[1] = 200;
//
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.printf("arr1[%d] = %d\n", i, arr1[i]);
//        }
//
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.printf("arr2[%d] = %d\n", i, arr2[i]);
//        }

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = food[i];
            System.out.printf("arr3[%d] = %s\n", i, arr3[i]);
        }

        // 동등성(equals): 내용을 비교한다.
        // 동일성(==): 주소 값을 비교한다.
    }
}
