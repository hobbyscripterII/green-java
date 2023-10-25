package com.green.second.ch1;

public class Hello {
    // main()은 애플리케이션이 실행될 때 제일 먼저 실행된다.
    // 매개변수명 `args`는 변경이 가능하다.
    public static void main(String[] args) {
        String str = "Hello";

        for (int i = 0; i < 3; i++) {
            // System: static 메소드
            // out: reference 변수
            // print(): 메소드
            System.out.print(str);
        }
    }
}
