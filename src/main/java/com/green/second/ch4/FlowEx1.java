package com.green.second.ch4;

import java.util.Scanner;

public class FlowEx1 {
    public static int asd(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("숫자를 하나 입력하세요.");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        System.out.printf("%s은(는) %s입니다.", str, ((asd(str) == 0) ? "잘못된 입력 값" : asd(str) % 2 == 0 ? "짝수" : "홀수"));
    }
}
