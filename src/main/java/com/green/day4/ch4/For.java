package com.green.day4.ch4;

public class For {
    public static void main(String[] args) {
        // 1: 초기화 공간, 2: 반복 여부 체크, 3: 증감식
//        for(int i = 0; i < 5; i ++) {
//            System.out.println("HI");
//        }
//        System.out.println("BYE");

        int j = 0;
        // 초기화, 증감식은 생략 가능하지만 생략하지 않는 경우가 대부분이다.
        for( ; j < 10; ) {
            System.out.printf("j = {%s}\n", ++j);
        }
    }
}