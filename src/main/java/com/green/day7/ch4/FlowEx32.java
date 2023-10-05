package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx32 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int val = 0;
        do {
            System.out.println("원하는 메뉴를 선택하세요.(종료: 0)\n(1) square\n(2) tri\n(3) log");
            val = s.nextInt();
            if(val >= 4 || val <= -1) {
                System.out.println("숫자를 잘못 입력하셨습니다.");
                continue;
            }
            System.out.printf("선택하신 메뉴는 %d입니다.\n", val);
        } while (val != 0);
        System.out.println("종료되었습니다.");
    }
}
