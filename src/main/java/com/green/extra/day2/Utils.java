package com.green.extra.day2;

import java.util.Arrays;

public class Utils {
    public static int abs(int val) {
        return val < 0 ? -val : val;
    }

    public static int sumArr(int[] arr) {
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }

        return result;
    }

    public static int[] mapPlus(int[] arr, int val) {
        int[] plus = new int[arr.length];

        for (int i = 0; i < plus.length; i++) {
            plus[i] += (arr[i] + val);
        }

        return plus;
    }
}

class UtilsTest {
    public static void main(String[] args) {
        int r = Utils.abs(-10);
        System.out.println("r: " + r); // 10
        System.out.println("r2: " + Utils.abs(-9)); // 9
        System.out.println("r3: " + Utils.abs(8)); // 8

        int[] arr = {10, 12, 13, 14};
//        int sum = Utils.sumArr(arr);
//        System.out.println(sum);

        int[] plus = Utils.mapPlus(arr, 5);
        System.out.println(Arrays.toString(plus));
    }
}
