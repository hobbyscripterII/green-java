package com.green.day8.ch5;

public class ArrayEx5 {
    public static void main(String[] args) {
        int[] score = {100, 88, 100, 100, 90};
        int scoreCnt = score.length;
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < scoreCnt; i++) {
            sum += score[i];
        }
        avg = (double) sum / scoreCnt;
        System.out.printf("sum = {%d}, avg = {%.1f}", sum, avg);
    }
}
