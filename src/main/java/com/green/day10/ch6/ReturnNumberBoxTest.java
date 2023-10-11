package com.green.day10.ch6;

public class ReturnNumberBoxTest {
    public static void main(String[] args) {
        // 클래스를 사용하기위해 *객체를 생성*한다.
        ReturnNumberBox rnb = new ReturnNumberBox();
//        int result1 = rnb.sum(10, 20);
//        int result2 = rnb.sum(30, 40);
//        System.out.println("result1 = " + result1);
//        System.out.println("result2 = " + result2);
        int result3 = rnb.abs(-10);
        int result4 = rnb.abs(99);
        int result5 = rnb.abs(98);
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);
        System.out.println("result5 = " + result5);
    }
}
