package com.green.day9.ch5;

public class ArrayEx18 {
    public static void main(String[] args) {
        int[][] score = {
                {101, 102, 103},
                {21, 22, 23},
                {31, 32, 33},
                {41, 42, 43}
        };

        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
                System.out.printf("score[%d][%d] = %d\n", i, j, score[i][j]);
            }
        }
        System.out.println("sum = " + sum);
    }
}
