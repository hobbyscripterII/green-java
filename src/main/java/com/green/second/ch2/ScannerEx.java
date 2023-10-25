package com.green.second.ch2;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        // 레퍼런스 변수는 주소값만 담을 수 있다.
        Scanner s = new Scanner(System.in);
        System.out.println("아무 값이나 입력해주시겠어요?");
        String str = s.nextLine();
        int val = MyUtils.parseStringToInt(str);
//        System.out.println(str); // 클래스명.static 메소드명(인자)
        System.out.println(val);
    }
}

class MyUtils {
    public static int parseStringToInt(String val) {
        try {
            return Integer.parseInt(val);
        } catch (Exception e) {

        }
        return -1;
    }
}