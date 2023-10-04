package com.green.day6.ch4;

import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args) {
        System.out.println("숫자를 입력하세요.");
        Scanner s = new Scanner(System.in);
        int val = s.nextInt();
        int sum = 0;

        while (val != 0) {
            // 방법1
            sum += val % 10;
            val /= 10;

            // 방법2
//            int modVal = val % 10;
//            val /= 10;
//            sum += modVal;
        }

        System.out.println("sum = " + sum);
    }
}
