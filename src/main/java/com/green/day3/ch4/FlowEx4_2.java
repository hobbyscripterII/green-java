package com.green.day3.ch4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FlowEx4_2 {
    public static void main(String[] args) {
        int score = 0;
        System.out.println("점수를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        try (scanner) {
            score = scanner.nextInt();
            char grade = 'D';

            if(score >= 90) {
                grade = 'A';
            } else if(score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            }
            System.out.printf("%c학점\n", grade);
        } catch (InputMismatchException e) {
            System.out.println("입력 형식이 잘못되었습니다. 정수를 입력하세요.");
        }
    }
}
