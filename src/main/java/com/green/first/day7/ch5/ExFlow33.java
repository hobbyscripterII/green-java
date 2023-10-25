package com.green.first.day7.ch5;

import java.util.Arrays;

public class ExFlow33 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // 배열 생성과 초기화를 동시에 한다.
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("arr[0] = " + arr[0]);
        System.out.println("arr[1] = " + arr[1]);
        System.out.println("arr[2] = " + arr[2]);
        System.out.println("arr[3] = " + arr[3]);
        System.out.println("arr[4] = " + arr[4]);
//        System.out.println("arr[5] = " + arr[5]); // ERROR

        arr[0] = 1000; // 배열 인덱스 값 변경
        System.out.println("arr[0] = " + arr[0]); // 변경된 값
        System.out.println("arr.length = " + arr.length); // 배열의 길이

        String cat[] = {"애", "옹"};
        System.out.println("cat = " + Arrays.toString(cat));

        int[] arr2 = new int[3]; // 배열 생성만 한다.
        System.out.println("arr2 = " + Arrays.toString(arr2)); // arr2 = [0, 0, 0]
    }
}
