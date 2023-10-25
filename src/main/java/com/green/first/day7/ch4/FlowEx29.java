package com.green.first.day7.ch4;

public class FlowEx29 {
    public static void main(String[] args) {
        // 369 GAME
        for (int i = 1; i < 101; i++) {
            System.out.printf("i = {%d} ", i);
            int temp = i;

            do {
                int val = temp % 10; // 나머지 값 구하기
                // val이 0이 아니고 3으로 나누면 0이 될 때
                if (val != 0 && val % 3 == 0) {
                    System.out.print("짝");
                }
            } while ((temp /= 10) != 0);
            System.out.println();

            // 몫이 0이 될 때까지
//            while (temp > 0) {
//                int val = temp % 10;
//                // val이 0이 아니고 3으로 나누면 0이 될 때
//                if (val != 0 && val % 3 == 0) {
//                    System.out.print("짝");
//                }
//                temp /= 10;
//            }
//            System.out.println();
        }

        // 오답
//        for (int i = 1; i < 101; i++) {
//            System.out.printf("i = {%d} %s\n", i, i % 10 == 3 || i % 10 == 6 || i % 10 == 9 ? "짝" : " ");
//        }
    }
}
