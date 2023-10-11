package com.green.day10.ch5;

import java.util.Scanner;

public class MultiArrEx4 {
    public static void main(String[] args) {
        String[][] words = {
                {"chair", "의자"},
                {"computer", "컴퓨터"},
                {"integer", "정수"},
                {"double", "실수"}
        };

        Scanner s = new Scanner(System.in);
        for (int i = 0; i < words.length; i++) {
            System.out.printf("%s의 뜻은?", words[i][0]);
            String result = s.nextLine();
            System.out.printf("%s", result.equals(words[i][1]) ? "정답입니다.\n" : "틀렸습니다. 정답은 " + words[i][1] + "입니다.\n");
        }
    }
}