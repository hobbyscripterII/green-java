package com.green.first.day8.ch5;

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

            if(z == random) continue; // 인덱스랑 랜덤 값이 같다면 밑에 코드는 실행되지 않는다.

            int temp = arr[z]; // temp에 값을 집어넣는다.
            arr[z] = arr[random]; // 인덱스에 랜덤 값을 집어넣는다.
            arr[random] = temp; // 인덱스(랜덤 값)에 백업한 인덱스 값을 넣는다.
        }

        System.out.println("arr = " + Arrays.toString(arr));
    }
}
