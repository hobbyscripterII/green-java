package com.green.day2.ch3;

public class OperatorEx23 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.printf("%s == %s : %b\n", s1, s2, s1 == s2);
        System.out.printf("%s == %s : %b\n", s1, s3, s1 == s3);

        // 문자열은 무조건 .equals를 사용한다.
        System.out.printf("%s.equals(%s) : %b\n", s1, s3, s1.equals(s3));
    }
}