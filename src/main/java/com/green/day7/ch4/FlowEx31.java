package com.green.day7.ch4;

public class FlowEx31 {
    public static void main(String[] args) {
        // 문제: 0 ~ 10까지 반복해서 출력할 때 3의 배수는 제외하고 출력한다.
        for (int i = 0; i <= 10; i++) {
            if (i % 3 == 0) continue;
            System.out.printf("i = {%d}\n", i);
        }
    }
}
