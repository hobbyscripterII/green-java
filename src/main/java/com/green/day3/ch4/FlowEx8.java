package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx8 {
    public static void main(String[] args) {
        System.out.println("당신의 주민번호를 입력하세요.");
        Scanner s = new Scanner(System.in);
        String jumin = s.next();
        char gender = jumin.charAt(7);
//        int gender = jumin.charAt(6);

        switch (gender) {
            case '1', '3' :
                System.out.println("남자입니다.");
                break;
            case '2', '4' :
                System.out.println("여자입니다.");
                break;
            default :
                System.out.println("유효하지 않은 주민등록번호입니다.");
        }
    }
}