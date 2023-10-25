package com.green.first.day3.ch4;

import java.util.Scanner;

public class FlowEx5Mission {
    public static void main(String[] args) {
        // 남자 평균키 170, 여자 평균키 157

        System.out.println("성별을 선택해주세요.");
        Scanner s = new Scanner(System.in);
        String gender = s.next();
        System.out.println("키를 입력해주세요.");
        s.nextLine();
        int height = s.nextInt();

        String avg = "";
        if (gender.equals("남자") && height > 170 || gender.equals("여자") && height > 157) {
            avg = "평균 이상";
        } else if (gender.equals("남자") && height == 170 || gender.equals("여자") && height == 157) {
            avg = "평균";
        } else {
            avg = "평균 이하";
        }
        System.out.printf("%d는 %s %s입니다.", height, gender, avg);
    }
}