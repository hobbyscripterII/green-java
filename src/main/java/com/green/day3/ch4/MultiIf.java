package com.green.day3.ch4;

import java.util.Scanner;

public class MultiIf {
    public static void main(String[] args) {
        System.out.println("숫자를 입력하세요.");
        Scanner s = new Scanner(System.in);
        int val = s.nextInt();

        if(val >= 50) {
            if(val >= 80) {
                System.out.printf("%d는(은) 엄청 크다!", val);
            } else {
                System.out.printf("%d는(은) 크다!", val);
            }
        } else {
            if(val >= 40) {
                System.out.printf("%d는(은) 엄청 크다!", val);
            } else {
                System.out.printf("%d는(은) 크다!", val);
            }
        }
    }
}
