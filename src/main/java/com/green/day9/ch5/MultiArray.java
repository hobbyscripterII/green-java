package com.green.day9.ch5;

import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {
        int[][] arr = {{100, 200}, {300, 400}, {500, 600}};
//        int[] intArr = arr[0];
//        int[] newIntArr = {1, 2, 3, 4};
//        arr[0] = newIntArr;
//        System.out.println(Arrays.toString(newIntArr));
        System.out.println(arr[0][0]);

        System.out.println(arr[1][1]); // 400
        System.out.println(arr[2][0]); // 500
        System.out.println(arr[2][1]); // 600

        System.out.println("arr[0].length = " + arr[0].length);
    }
}
