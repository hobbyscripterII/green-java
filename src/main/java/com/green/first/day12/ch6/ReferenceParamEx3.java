package com.green.first.day12.ch6;

import java.util.Arrays;

public class ReferenceParamEx3 {
    // 오름차순 정렬
    public static void sortArr(int[] arr) {
        // 1번째 실행: 1, 2, 3, 4, 5
        // 2번째 실행: 1, 2, 3, 4
        // 3번째 실행: 1, 2, 3
        // 4번째 실행: 1, 2
        // 5번째 실행: 1
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) { // arr.length - 1
                int idx = j + 1;
                if (arr[j] > arr[idx]) {
                    int temp = arr[j];
                    arr[j] = arr[idx];
                    arr[idx] = temp;
                }
            }
        }
        System.out.println("arr = " + Arrays.toString(arr));
    }

    static void printArr(int[] arr) {
        System.out.printf("[%d", arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.printf(", %d", arr[i]);
        }
        System.out.print("]");
    }

    static int sumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 6, 5, 4};
//        sortArr(arr);
//        printArr(arr);
        System.out.println(sumArr(arr));
    }
}
