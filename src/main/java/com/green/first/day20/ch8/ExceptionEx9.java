package com.green.first.day20.ch8;

public class ExceptionEx9 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("일부러 Exception을 발생시킵니다.");
            System.out.println("try");
            throw e; // 예외를 던진다.
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("끝!");
    }
}
