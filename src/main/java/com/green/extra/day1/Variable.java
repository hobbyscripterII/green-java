package com.green.extra.day1;

public class Variable {
    public static void main(String[] args) {
        int val; // 변수를 생성한다.
        val = 0; // 값을 대입한다. == 변수를 초기화한다.

        boolean power = true; // 변수 생성과 동시에 초기화한다.

        int i1 = 20;

        System.out.println("i1 = " + i1 + 30); // i1이 연산 시점에 '문자열'로 변경된다(자동 형변환)
        System.out.println("i1 = " + "20" + 30);
        System.out.println("i1 = " + "20" + "30");
        System.out.println("i1 = " + "2030");

        System.out.println("i1 = " + (i1 + 30));
    }
}
