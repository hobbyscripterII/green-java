package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args) {
        int score = 0;
        System.out.println("점수를 입력하세요.");
        Scanner s = new Scanner(System.in);
        score = s.nextInt();

        String str_ = String.valueOf(score);
        String str = str_.substring(1, 2);
        int val = Integer.parseInt(str);

//        System.out.println("result = " + str);

        String result = "A+";

        if (score == 100) {
            System.out.println(result);
        } else {
            if (score >= 90) {
                if (val <= 2) {
                    System.out.println(result + "-");
                } else if (val >= 8) {
                    System.out.println(result + "+");
                } else {
                    System.out.println(result);
                }
            } else {
                result = "B";
                if (val <= 2) {
                    System.out.println(result + "-");
                } else if (val >= 8) {
                    System.out.println(result + "+");
                } else {
                    System.out.println(result);
                }
            }
        }
    }
}
