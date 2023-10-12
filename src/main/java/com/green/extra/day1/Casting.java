package com.green.extra.day1;

public class Casting {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 3;
//        float result = n1 / n2; // 자동 형변환이 되기 때문에 실수가 날라간다.
        float result = (float) n1 / n2; // '/' 보다 '(float) n1' 형변환이 먼저 발생한다.
        System.out.printf("result = %.3f", result);
    }
}
