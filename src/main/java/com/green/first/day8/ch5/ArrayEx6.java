package com.green.first.day8.ch5;

public class ArrayEx6 {
    public static void main(String[] args) {
        // score 안에서 min, max 값 구해서 출력하기
        int[] score = {79, 88, 91, 33, 100, 55, 95, 200};
        int max = score[0];
        int min = score[0];

        for (int i = 1; i < score.length; i++) {
            if(max < score[i]) {
                max = score[i];
            }

            if (min > score[i]) {
                min = score[i];
            }
        }
        System.out.printf("min = {%d}, max = {%d}", min, max);
    }
}
