package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx11Result {
    public static void main(String[] args) {
        final int LEN = 10;
        int[] numArr = new int[LEN];
        int[] cntArr = new int[LEN];

        for (int i = 0; i < LEN; i++) { // i < LEN(10) = 0 ~ 9
            numArr[i] = (int) (Math.random() * LEN); // 0 ~ 9
        }

        System.out.println("numArr[] = " + Arrays.toString(numArr));
//        cntArr[3] = cntArr[3] + 1;
//        cntArr[3] += 1;
//        cntArr[3]++;
        System.out.println("cntArr[] = " + Arrays.toString(cntArr));

//        for (int i = 0; i < LEN; i++) {
//            int val = numArr[i]; // 랜덤 값을 변수에 대입한다.
//            cntArr[val]++; // cntArr 인덱스의 값을 증가시킨다.(랜덤 값에 일치하는 인덱스의 값을 증가시킨다)
//
////            cntArr[val] += 1;
////            cntArr[val] = cntArr[val] + 1 ;
//        }

        for (int i : numArr) {
            cntArr[i]++;
            System.out.printf("i = {%d}, cntArr[%d] = {%d}\n", i, i, cntArr[i]);
        }

        for (int i = 0; i < LEN; i++) {
            System.out.printf("%d의 개수: = %d\n", i, cntArr[i]);
        }
    }
}
