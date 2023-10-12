package com.green.day11.ch6;

import java.util.Scanner;

public class StarPrintTest {
    public static void main(String[] args) {
        StarPrint sp = new StarPrint();
//        sp.line(5);
//        sp.line(7);

//        System.out.println("숫자를 입력하세요.");
//        Scanner s = new Scanner(System.in);
//        int val = s.nextInt();
//        sp.square(val);
//        sp.triangle(val);

//        String gender3 = sp.chkGenderById("000000-000000");
//        String gender1 = sp.chkGenderById("000000-100000");
//        String gender2 = sp.chkGenderById("000000-200000");
//        System.out.println(gender1);
//        System.out.println(gender2);
//        System.out.println(gender3);

        int sum = sp.sumFromTo(4, 10);
        int sum2 = sp.sumFromTo(10, 15);
        System.out.println(sum);
        System.out.println(sum2);
    }
}