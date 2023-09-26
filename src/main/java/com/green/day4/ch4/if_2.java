package com.green.day4.ch4;

import java.util.Scanner;

public class if_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("성별을 입력해주세요.");
        String gender = s.next();

//        if (gender.equals("남자") || gender.equals("남") || gender.equals("man") || gender.equals("Man")) {
//            System.out.println("잘생겼다.");
//        } else if(gender.equals("여자") || gender.equals("여") || gender.equals("woman") || gender.equals("Woman")) {
//            System.out.println("이쁘다.");
//        } else {
//            System.out.println("누구세요.");
//        }

        String message = "잘생겼다.";

        switch (gender) {
            case "남자", "남", "man", "Man" : break;
            case "여자", "여", "woman", "Woman" : message = "이쁘다."; break;
            default: message = "누구세요."; break;
        }

        System.out.println(message);
    }
}