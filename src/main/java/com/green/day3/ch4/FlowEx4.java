package com.green.day3.ch4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FlowEx4 {
    public static void main(String[] args) {
        int score = 0;
        System.out.println("점수를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        try (scanner) {
            score = scanner.nextInt();
            if (score >= 90) {
                System.out.println("A학점");
            } else if (score >= 80) {
                System.out.println("B학점");
            } else if (score >= 70) {
                System.out.println("C학점");
            } else {
                System.out.println("D학점");
            }
        } catch (InputMismatchException e) {
            System.out.println("입력 형식이 잘못되었습니다. 정수를 입력하세요.");
        }
    }
}
