package com.green.second.ch5;

import java.util.Arrays;

class MyArray {
    public static int[] make(int length) {
        return new int[length];
    }

    // Arrays.toString처럼 만들기
    public static String inputStart(final int[] arr, final int val) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = val + i;
            stringBuilder.append(arr[i]);
            if (i != arr.length - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static int[] mapSum(int[] arr, int val) {
        int[] returnArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            returnArr[i] += arr[i] + val;
        }
        return returnArr;
    }

    public static int sum(int[] arr) {
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        return result;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = arr[i] < min ? (min = arr[i]) : min;
        }
        return min;
    }

    public static void shuffle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int rIdx = (int) (Math.random() * arr.length);
            if (i == rIdx) {
                continue;
            }
            int temp = arr[i];
            arr[i] = arr[rIdx];
            arr[rIdx] = temp;
        }
    }

//    public static void shuffle(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            int[] random = new int[arr.length];
//            int temp = arr[i];
//            int rVal = (int) (Math.random() * arr.length);
//            random[i] = rVal;
//            for (int j = 0; j < i; j++) {
//                if (arr[i] == arr[j]) {
//                    i--;
//                }
//            }
//            arr[i] = rVal;
//            arr[rVal] = arr[i];
//        }
//    }
}

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] arr = MyArray.make(3);
//        System.out.println(MyArray.inputStart(arr, 8));

        int[] arr2 = MyArray.mapSum(arr, 3);
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.toString(arr)); // 원본이 변하지 않았다!

        int sum = MyArray.sum(arr2);
//        System.out.println(sum);

        int[] arr4 = {10, 2, 1, 9, 13};
        int min = MyArray.min(arr4);
//        System.out.println(min);

        System.out.println(Arrays.toString(arr4));
        MyArray.shuffle(arr4);
        System.out.println(Arrays.toString(arr4));
    }
}