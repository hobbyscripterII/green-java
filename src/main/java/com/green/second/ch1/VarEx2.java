package com.green.second.ch1;

public class VarEx2 {
    public static void main(String[] args) {
        // 변수 선언과 동시에 초기화한다.
//        int x = 10;
//        int y = 30;
        int x = 10, y = 30; // 이렇게도 가능하다.

        System.out.printf("x = %d, y = %d\n", x, y);

        int temp = x;
        x = y;
        y = temp;

        System.out.printf("x = %d, y = %d\n", x, y);
    }
}
