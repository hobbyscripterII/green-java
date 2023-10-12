package com.green.day5.ch4;

public class OperatorEx19 {
    public static void main(String[] args) {
        int x = 10;
        int y = 8;

//        System.out.printf("x / y = %d, 나머지 값 = %d", x / y, x % y);

        for (int i = 0; i < 20; i++) {
            int val = (int) (Math.random() * 10) + 1;
            System.out.printf("val: %d > %s수입니다.\n", val, val % 2 == 0 ? "짝" : "홀");
        }
    }
}
