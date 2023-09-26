package com.green.day4.ch4;

public class if_3 {
    public static void main(String[] args) {
        int val = (int) (Math.random() * 100) + 1;
        System.out.printf("%d은(는) %s입니다.", val, val % 2 == 0 ? "짝수" : "홀수");
    }
}