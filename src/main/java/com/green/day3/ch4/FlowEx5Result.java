package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5Result {
    public static void main(String[] args) {
        int score = 0;
        System.out.println("점수를 입력하세요.");
        Scanner s = new Scanner(System.in);
        score = s.nextInt();
        String grade = "C";
        String opt = "";

        if (score >= 90) {
            grade = "A";
            if (score >= 98) {
                opt = "+";
            } else if (score <= 93) {
                opt = "-";
            }
        } else if (score >= 80) {
            grade = "B";
            if (score >= 88) {
                opt = "+";
            } else if (score <= 83) {
                opt = "-";
            }
        }
        System.out.printf("%s%s", grade, opt);
    }
}
