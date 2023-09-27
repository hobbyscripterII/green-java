package com.green.day5.ch4;

import java.util.Scanner;

public class FlowEx17Mission {
    public static void main(String[] args) {
//        System.out.println("*을 출력할 라인의 수를 입력하세요.");
//        Scanner s = new Scanner(System.in);
//        int val = s.nextInt();

        // EX
        int val = 5;

        // i가 1부터 시작해서 5가 될 때까지 반복한다.
        for (int i = 1; i <= val; i++) {
            // j는 5(val) - i(1 ... 5), 5 - 1 = 4, 5 - 2 = 3
            // 4, 3, 2, 1식으로 감소한다.
            // 처음엔 공백 4개였다가 3개 ... 1개
            for (int j = val - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = val; i > 0; i--) {
            for (int j = 1; j <= val; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        for (int i = val; i > 0; i--) {
            for (int j = 1; j <= val; j++) {
                System.out.print(j < i ? " " : "*");
            }
            System.out.println();
        }
    }
}
