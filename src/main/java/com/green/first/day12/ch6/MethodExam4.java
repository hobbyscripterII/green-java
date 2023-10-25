package com.green.first.day12.ch6;

import com.green.first.day10.ch6.MethodExam;

import java.util.Arrays;

public class MethodExam4 {
    int[] plusMap(int[] arr, int val) {
        int[] result = new int[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr[i] + val; //result[i] = arr[i] + val;
//            result[i] += arr[i] + val; //result[i] = result[i] + arr[i] + val (중첩문)
        }
        return result;
    }

    void plusOrigin(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += val;
        }
        System.out.println("arr = " + Arrays.toString(arr));
    }

//    int[] randomValFromTo(int length, int rMin, int rMax) {
//        int[] arr = new int[length];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int)(Math.random() * (rMax - rMin + 1)) + rMin;
//        }
//        return arr;
//    }

    int[] randomValFromTo(int length, int rMin, int rMax) {
        MethodExam methodExam = new MethodExam();
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = methodExam.randomValFromTo(rMin, rMax);
        }
        return arr;
    }

    public static void main(String[] args) {
        MethodExam4 methodExam4 = new MethodExam4();
//        int[] arr = {10, 20, 30};
//        int[] rArr1 = methodExam4.plusMap(arr, 2);
//        System.out.println("rArr1 = " + Arrays.toString(arr));
//        System.out.println("rArr1 = " + Arrays.toString(rArr1));

//        int[] arr = {10, 20, 30, 40, 50};
//        methodExam4.plusOrigin(arr, 2);

        int[] rArr = methodExam4.randomValFromTo(10, 5, 20); // 배열크기, min, max
        System.out.println(Arrays.toString(rArr));
    }
}
