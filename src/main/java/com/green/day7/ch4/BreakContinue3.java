package com.green.day7.ch4;

public class BreakContinue3 {
    public static void main(String[] args) {
        loop1:
        for (int i = 0; i < 5; i++) {
            for (int z = 10; z < 15; z++) {
                if (z == 13) {
                    break loop1; // 중첩 반복문이 brake될 경우, 상위 반복문도 break된다.
                }
                System.out.printf("i = {%d}, z = {%d}\n", i, z);
            }
        }

        loop2:
        for (int i = 0; i < 5; i++) {
            for (int z = 10; z < 15; z++) {
                if (z == 13) {
                    continue loop2;
                }
                System.out.printf("i = {%d}, z = {%d}\n", i, z);
            }
        }
    }
}
