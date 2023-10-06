package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {
        // Mission1. 정수 10개를 저장할 수 있는 배열을 만든다.
        int[] arr = new int[10];
        // Mission2. 0 ~ 9 값을 순차적으로 대입한다.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        System.out.println("arr = " + Arrays.toString(arr));

        for (int z = 0; z < arr.length; z++) {
            // Mission3. 스와핑하기
            int random = (int) (Math.random() * arr.length);

            if(z == random) continue;

            int temp = arr[z];
            arr[z] = arr[random];
            arr[random] = temp;
        }

        System.out.println("arr = " + Arrays.toString(arr));
    }
}
