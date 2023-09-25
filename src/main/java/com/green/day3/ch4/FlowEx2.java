package com.green.day3.ch4;

/*
    Scanner
    if
 */

import java.util.Scanner;

public class FlowEx2 {
    public static void main(String[] args) {
        // 1. 콘솔 창에 '숫자를 하나 입력하세요'를 출력한다.
        System.out.println("숫자를 입력하세요.");
        Scanner s = new Scanner(System.in);
        // 2. 입력을 기다린다.
        // 3. 숫자를 입력하고 엔터를 누르면 String 변수에 해당 값이 저장된다.
        String str = s.next();
        // 4. 해당 문자열을 정수형으로 형변환한다.
        int result = Integer.parseInt(str);
        // 5. 해당 숫자가 '0'이라면 콘솔에 '입력하신 숫자는 0입니다'를 출력한다.
        if (result == 0) {
            System.out.printf("입력하신 숫자는 %d입니다.", result);
        } else {
            // 6. 해당 숫자가 '0'이 아니라면 콘솔 창에 '입력하신 숫자는 0이 아닙니다'를 출력한다.
            System.out.printf("입력하신 숫자는 %d입니다.", result);
        }
    }
}
