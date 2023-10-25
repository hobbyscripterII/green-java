package com.green.first.day3.ch4;

import java.util.Scanner;

public class FlowEx2_2 {
    public static void main(String[] args) {
        System.out.println("숫자를 하나 입력하세요.");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        // 1. 분기문 사용
//        int result = x % 2;
//        if(result == 0) {
//            System.out.printf("%d는 짝수입니다.", x);
//        } else {
//            System.out.printf("%d는 홀수입니다.", x);
//        }

        // 2. PrintStream + 3항연산자 사용
//        PrintStream result = x % 2 == 0 ? System.out.printf("%d는 짝수입니다.", x) : System.out.printf("%d는 홀수입니다.", x);

        // 3. 분기문 + 3항연산자 사용
        if(x == 0) {
            System.out.println("'0'을 제외한 다른 값을 입력해주세요.");
        } else {
            int result = x % 2;
            System.out.printf("%d는(은) %s수입니다.", result, (result % 2 == 0 ? "짝" : "홀"));
        }
    }
}