package com.green.first.day13.ch6;

public class MyMath2 {
    int num;
    static int staticNum;

    static void print() {
//        System.out.printf("staticNum = {%d}\n", MyMath2.staticNum); // 클래스명 생략 가능
        System.out.printf("staticNum = {%d}\n", staticNum); // 가능

        // 인스턴스는 객체 생성 후 사용 가능하기 때문에 클래스 메소드에서는 인스턴스 변수를 사용할 수 없다.
//        System.out.printf("staticNum = {%d} num = {%d}\n", staticNum, num); // Error
    }

    // 인스턴스 메소드는 객체 생성 후 사용 가능하기 때문에 static 변수 사용이 가능하다.
    void print2() {
        System.out.printf("staticNum = {%d} num = {%d}\n", staticNum, num);
    }
}
