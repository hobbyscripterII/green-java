package com.green.extra.day1;

public class Naming {
    public static void main(String[] args) {
        int _name, $name; // 변수 선언시 가능한 특수문자
//        int public, class, static, void; // 예약어
        int abc, aBc, Abc; // 변수는 대소문자를 구분한다.
//        int 1ab; // 변수명의 첫 글자는 숫자가 올 수 없다.

        // hello my name is lee
        int helloMyNameIsLee; // 카멜: 변수명, 메소드명
        int HelloMyNameIsLee; // 파스칼: 클래스
        final int HELLO_MY_NAME_IS_LEE = 10; // 상수는 대문자로 작성하며 초기화를 동시에 해야한다.
    }
}
