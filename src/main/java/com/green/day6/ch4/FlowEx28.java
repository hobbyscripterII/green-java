package com.green.day6.ch4;

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        /*
        UP/DOWN GAME
        for: 반복 횟수를 알 때
        while: 멈춰야 하는 조건을 알 때
         */
        Scanner s = new Scanner(System.in);
        int answer = (int) (Math.random() * 100) + 1;
        System.out.println("1 ~ 100 사이의 정수를 입력하세요.");

        while (true) {
            int input = s.nextInt();
            if (input == answer) {
                break;
            }
            System.out.printf("%s \n", input < answer ? "UP" : "DOWN"); // 3항 연산자로 구현 가능하기 때문에 if문 생략 가능
        }
        System.out.print("정답입니다!");
    }
}
