package com.green.first.day4.ch4;

import java.util.Scanner;

public class if_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("성별을 입력하세요.");
        String gender = s.next();

        if (gender.equals("여자") || gender.equals("남자")) {
            System.out.println(gender.equals("여자") ? "예쁘다." : "잘생겼다.");
        } else {
            System.out.println("누구세요.");
        }
    }
}