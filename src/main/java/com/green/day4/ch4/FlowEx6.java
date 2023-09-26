package com.green.day4.ch4;

import java.util.Scanner;

public class FlowEx6 {
    public static void main(String[] args) {
        System.out.println("현재 월을 입력하세요.");
        Scanner s = new Scanner(System.in);
        int month = s.nextInt();
        switch (month) {
            case 3, 4, 5 :
                System.out.println("현재 계절은 봄입니다.");
                break;
            case 6, 7, 8 :
                System.out.println("현재 계절은 여름입니다.");
                break;
            case 9, 10, 11 :
                System.out.println("현재 계절은 가을입니다.");
                break;
            case 12, 1, 2 :
                System.out.println("현재 계절은 겨울입니다.");
                break;
        }
    }
}
