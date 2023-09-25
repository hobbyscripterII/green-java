package com.green.day3.ch4;

import java.util.Scanner;

public class OperatorEx32Mission {
    public static void main(String[] args) {
        // 음수 아무 값일 경우 양수로 출력한다.
        // 양수 아무 값일 경우 양수로 출력한다.

//        int n = -10;
//        n = n * -1;
//        System.out.println("n = " + n);

        Scanner s = new Scanner(System.in);
        int val = s.nextInt();

        // 1. 분기문
//        if(val < 0) {
//            val = val * -1;
//            System.out.println("val = " + val);
//        } else {
//            System.out.println("val = " + val);
//        }

        // 2. 삼항 연산자
        System.out.println(val < 0 ? "val = " + val * -1 : "val = " + val);

        System.out.println(val < 0 ? "val = " + -val : "val = " + val);
    }
}
