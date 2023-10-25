package com.green.first.day9.ch5;

public class ArrayEx19 {
    public static void main(String[] args) {
        int[][] score = {
                {101, 102, 103},
                {21, 22, 23},
                {31, 32, 33},
                {41, 42, 43},
                {51, 52, 53}
        };

        System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
        System.out.println("--------------------------");
        int k = 0;
        int e = 0;
        int s = 0;
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; i < score.length; i++) {
                k += score[i][j];
                e += score[i][j + 2];
                s += score[i][j + 1];
//                sum += score[i][j] + score[i][j + 1] + score[i][j + 2];
//                avg += (double)((score[i][j] + score[i][j + 1] + score[i][j + 2]) / 3) / 5;
                System.out.printf("%d\t%d\t%d\t%d\t%d\t%.2f\n", i + 1, score[i][j], score[i][j + 1], score[i][j + 2], score[i][j] + score[i][j + 1] + score[i][j + 2], (double) (score[i][j] + score[i][j + 1] + score[i][j + 2]) / 3);
            }
        }
        System.out.println("--------------------------");
        System.out.printf("총점\t%d\t%d\t%d\n", k, s, e);
    }
}
