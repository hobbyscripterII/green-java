package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5Result2 {
    public static void main(String[] args) {
        int score = 0;
        System.out.println("점수를 입력하세요.");
        Scanner s = new Scanner(System.in);
        score = s.nextInt();

        if(score >= 90) {
            if(score >= 98) {
                System.out.println("A+");
            } else if (score <= 93) {
                System.out.println("A-");
            } else {
                System.out.println("A");
            }
        } else if(score >= 80) {
                System.out.println("B+");
            if(score >= 88) {
                System.out.println("B-");
            } else {
                System.out.println("B");
            }
        } else {
            System.out.println("C");
        }
    }
}
