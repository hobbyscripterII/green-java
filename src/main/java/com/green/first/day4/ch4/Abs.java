package com.green.first.day4.ch4;

import java.util.Scanner;

public class Abs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int val = s.nextInt();
        int result = 0;
        // 10은(는) 절대값 10
        // -9은(는) 절대값 9
        
        if(val < 0) {
            result = -val;
        } else {
            result = val;
        }
        System.out.printf("%d은(는) 절대값 %d입니다.", val, result);
    }
}