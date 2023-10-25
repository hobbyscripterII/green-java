package com.green.first.day9.ch5;

import java.util.Arrays;

public class ArrayEx11 {
    public static void main(String[] args) {
        final int LEN = 10;
        int[] numArr = new int[LEN];
        int[] cntArr = new int[LEN];

        for (int i = 0; i < LEN; i++) {
            numArr[i] = (int) (Math.random() * LEN);
        }

        System.out.println("numArr[] = " + Arrays.toString(numArr));
        System.out.println("cntArr[] = " + Arrays.toString(cntArr));

        for (int i = 0; i < LEN; i++) {
            for (int j = 0; j < LEN; j++) {
                if(numArr[j] == i) {
                    cntArr[i] += 1;
                }
            }
        }

        for(int i = 0; i < LEN; i++) {
            System.out.printf("%d의 개수: = %d\n", i, cntArr[i]);
        }
    }
}
