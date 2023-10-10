package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {
        // 문제 1
//        int[] arr = new int[5];
//
//        for (int i = 0; i < arr.length; i++) {
//            int random = (int) (Math.random() * 10) + 1;
//            arr[i] = random;
//        }
//        System.out.println("arr = " + Arrays.toString(arr));

        // 문제 2(1번 문제 중복 제거)
//        int[] arr = new int[5];
//
//        for (int i = 0; i < arr.length; i++) {
//            int random = (int) (Math.random() * 5) + 1;
//            for (int z = 0; z < arr.length; z++) {
//                arr[z] = arr[i];
//                if (arr[i] == arr[z]) {
//                    continue;
//                }
//            }
//            arr[i] = random;
//        }
//        System.out.println("arr = " + Arrays.toString(arr));

        // 문제 2(1번 문제 중복 제거) - 풀이
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            // for문이 실행될 때마다 새로운 랜덤 값이 생성된다.
            arr[i] = (int) (Math.random() * 5) + 1;

            // i가 z보다 클 때 실행된다. == i가 1이 될 때부터 실행된다.(값이 담길 때)
            for (int z = 0; z < i; z++) {
                if (arr[i] == arr[z]) {
                    i--; // 배열에 담겨있는 숫자가 중복이면 i를 '-'해서 중복된 값이 없을 때까지 다시 값을 넣는다.
                    break;
                }
            }
        }
        System.out.println("arr = " + Arrays.toString(arr));
    }
}
