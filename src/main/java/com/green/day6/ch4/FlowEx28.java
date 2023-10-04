package com.green.day6.ch4;

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = 0;
        int answer = (int) (Math.random() * 100) + 1;

        while (true) {
            input = s.nextInt();
            if (input < answer || input > answer) {
                System.out.printf("ANSWER = %d, %s \n", answer, input < answer ? "UP" : "DOWN");
            } else {
                System.out.printf("ANSWER = %d, %s \n", answer, "끝");
                break;
            }
        }
    }
}
