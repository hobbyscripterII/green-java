package com.green.day3.ch4;

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

//        if(gender.equals("남자")) {
//            if(height < 170) {
//                System.out.printf("%d는 남자 평균 미만입니다.", height);
//            } else if(height == 170) {
//                System.out.printf("%d는 남자 평균입니다.", height);
//            } else {
//                System.out.printf("%d는 남자 평균 초과입니다.", height);
//            }
//        } else {
//            if(height < 157) {
//                System.out.printf("%d는 여자 평균 미만입니다.", height);
//            } else if(height == 157) {
//                System.out.printf("%d는 여자 평균입니다.", height);
//            } else {
//                System.out.printf("%d는 여자 평균 초과입니다.", height);
//            }
//        }

        if(gender.equals("남자") && height > 170 || gender.equals("여자") && height > 157) {
            System.out.printf("%d는 %s 평균 이상입니다.", height, gender);
        } else if(gender.equals("남자") && height == 170 || gender.equals("여자") && height == 157) {
            System.out.printf("%d는 %s 평균입니다.", height, gender);
        } else {
            System.out.printf("%d는 %s 평균 이하입니다.", height, gender);
        }
    }
}
