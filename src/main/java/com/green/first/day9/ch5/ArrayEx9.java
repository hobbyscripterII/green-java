package com.green.first.day9.ch5;

import java.util.Arrays;

public class ArrayEx9 {
    public static void main(String[] args) {
        int[] code = {-4, -1, 3, 6, 11};
        int[] arr = new int[10];

        for (int i = 1; i < arr.length; i++) {
            // code의 인덱스를 *랜덤*으로 돌려 arr에 값을 넣는다.
            arr[i] = code[(int) (Math.random() * code.length)]; // 0 ~ 4
        }

        System.out.println("arr[i] = " + Arrays.toString(arr));
    }
}
