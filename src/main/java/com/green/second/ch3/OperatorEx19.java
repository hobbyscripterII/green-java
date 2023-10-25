package com.green.second.ch3;

public class OperatorEx19 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 8;

//        System.out.println("n1 / n2 = " + (n1 / n2));
//        System.out.println("n1 % n2 = " + (n1 % n2));

//        System.out.println(n1 % 10); // 1의 자리 숫자 구하기

        int random = (int) (Math.random() * 9) + 1; // (Math.random() * (최대값 - 최소값 + 1)) + 최소값
        System.out.printf("%d는 %s입니다.", random, random % 2 == 0 ? "짝수" : "홀수");
    }
}
