package com.green.day4.ch4;

import java.util.Scanner;

public class FlowEx10 {
    public static void main(String[] args) {
        System.out.println("점수를 입력하세요.");
        Scanner s = new Scanner(System.in);
        char grade = ' ';

        String temp = s.next();
        int score_ = Integer.parseInt(temp);

        int score = score_ / 10;

        switch (score) {
            case 9, 10:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            default:
                grade = 'D';
                break;
        }

        System.out.printf("학점 = {%s}", grade);
    }
}
