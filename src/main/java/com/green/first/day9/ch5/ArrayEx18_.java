package com.green.first.day9.ch5;

public class ArrayEx18_ {
    public static void main(String[] args) {
        int[][] score = {
                {101, 102, 103},
                {21, 22, 23},
                {31, 32, 33},
                {41, 42, 43}
        };

        int sum = 0;
//        for (int i = 0; i < score.length; i++) {
//            for (int j = 0; j < score[i].length; j++) {
//                sum += score[i][j];
//                System.out.printf("score[%d][%d] = %d\n", i, j, score[i][j]);
//            }
//        }
//        System.out.println("sum = " + sum);

        sum = 0;
        for (int[] arr : score) { // score 배열의 인덱스(score = {{0], {1], {2]})
            for (int val : arr) { // score 특정 인덱스의 값(score = {{101, 102, 103} ...})
                sum += val;
            }
        }
        System.out.println("sum = " + sum);
    }
}
