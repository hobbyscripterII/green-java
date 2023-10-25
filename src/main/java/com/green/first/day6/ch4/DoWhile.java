package com.green.first.day6.ch4;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int sum = 0;
        Scanner s = new Scanner(System.in);

        while(true) {
            System.out.println("1 ~ 100 사이의 숫자를 입력해주세요. (종료: 0)");
            System.out.print(">>>>> ");
            int val = s.nextInt();
            if(val == 0) {
                break;
            }
            sum += val;
        }
        System.out.printf("끝 = {%d}", sum);
    }
}
