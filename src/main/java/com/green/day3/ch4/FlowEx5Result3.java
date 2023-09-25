package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5Result3 {
    public static void main(String[] args) {
        int score = 0;
        System.out.println("점수를 입력하세요.");
        Scanner s = new Scanner(System.in);
        score = s.nextInt();

        String grade = "C";
        String opt = "";

        if(score >= 90) {
            grade = "A";
        } else if(score >= 80) {
            grade = "B";
        }

        // C학점 제외 '+', '-' 출력하기
        if(score >= 80) {
            int mod = score % 10;
            if(mod >= 8 || score == 100) {
                opt = "+";
            } else if(mod % 10 <= 3) {
                opt = "-";
            }
        }
        System.out.printf("%s%s", grade, opt);
    }
}
