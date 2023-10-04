package com.green.day6.ch4;

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = 0;
        int answer = (int) (Math.random() * 100) + 1;
        System.out.println("1 ~ 100 사이의 정수를 입력하세요.");
        System.out.printf("ANSWER = %d\n", answer);

        while (true) {
            input = s.nextInt();
            if (input == answer) {
                System.out.print("끝");
                break;
            }
            System.out.printf("ANSWER = %s \n", input < answer ? "UP" : "DOWN");
        }
    }
}
