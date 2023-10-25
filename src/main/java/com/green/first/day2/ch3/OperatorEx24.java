package com.green.first.day2.ch3;

public class OperatorEx24 {
    public static void main(String[] args) {
        boolean b1 = 1 == 1 && 2 == 2; // &&: and 연산자, 전부 true여야한다.
        System.out.println("b1 = " + b1); // 전부 다 true이므로 true를 반환한다.

        boolean b2 = 1 == 1 && 2 == 2 && 3 == 4;
        System.out.println("b2 = " + b2); // 3 == 4가 false이므로 false를 반환한다.

        boolean b3 = 1 == 2 || 2 == 3 || 4 == 4; // ||: or 연산자, 하나라도 true면 true를 반환한다.
        System.out.println("b3 = " + b3); // 4 == 4가 true이므로 true를 반환한다.

        boolean b4 = 1 == 2 || 2 == 3 || 4 == 5;
        System.out.println("b4 = " + b4); // 전부 다 다르므로 false를 반환한다.

        boolean b5 = 1 == 1; // !: 부정 연산자
        System.out.println("b5 = " + b5);
        System.out.println("b5 = " + !b5);
        System.out.println("b5 = " + !!b5);
    }
}
