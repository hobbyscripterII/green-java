package com.green.day5.ch4;

import java.util.Scanner;

public class FlowEx17 {
    public static void main(String[] args) {
        System.out.println("*을 출력할 라인의 수를 입력하세요.");
        Scanner s = new Scanner(System.in);
        // 사용자에게 *을 출력할 수를 입력받는다.
        int val = s.nextInt();

        // y가 2가되면 아래의 for문을 실행한다.
        for(int y = 0; y <= val; y++) {
            // x가 y의 값만큼 *을 출력한다.
            for(int x = 0; x < y; x++) {
                System.out.print("*");
            }
            // 위의 for문이 끝나면 개행한다.
            System.out.println();
        }
        // 다시 for문으로 올라가 y가 3이되면 for문을 실행한다.
    }
}
