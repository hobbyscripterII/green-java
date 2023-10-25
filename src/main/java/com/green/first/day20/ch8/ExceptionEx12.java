package com.green.first.day20.ch8;

public class ExceptionEx12 {
    static void method1() {
        int a = 10 / 0;
    }

    static void method2() throws Exception {
        int a = 10 / 0;
    }

    public static void main(String[] args) {
//        method1();

        try {
            method2();
        } catch (Exception e) {
            System.out.println("method2() 예외가 발생했습니다.");
        }

        System.out.println("끝!");
    }
}

class ExceptionEx12_1 {
    static void method1() throws Exception {
        method2();
    }

    static void method2() throws Exception {
        int a = 10 / 0;
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {

        }
    }
}
