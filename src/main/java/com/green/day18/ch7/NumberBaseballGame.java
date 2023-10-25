package com.green.day18.ch7;

import java.util.Scanner;

class NumberBaseball {
    private final int GAME_COUNT;
    private int[] gameNumbers;

    public NumberBaseball(int cnt) {
        GAME_COUNT = cnt; // 생성자를 통해 넣는 상수도 가능하다.
        gameNumbers = new int[GAME_COUNT];
    }

    public void start() {
        setRandomNumNotDuplicate();
        getUserInput();
    }

    private boolean checkResult(int[] arr) {
        int strike = 0, ball = 0, out;
        for (int i = 0; i < GAME_COUNT; i++) {
            for (int j = 0; j < GAME_COUNT; j++) {
                if (gameNumbers[i] == arr[j]) {
                    if (i == j) {
                        strike++;
                    } else {
                        ball++;
                    }
                }
            }
        }
        out = GAME_COUNT - (strike + ball);
        return false;
    }

    private void getUserInput() {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[GAME_COUNT];

        for (int i = 0; i < GAME_COUNT; i++) {
            System.out.printf("%d. 숫자: ", i + 1);
            arr[i] = s.nextInt();
        }
        boolean check = checkResult(arr);
        s.close();
    }

    private void setRandomNumNotDuplicate() {
        for (int i = 0; i < GAME_COUNT; i++) {
            gameNumbers[i] = (int) (Math.random() * 9);
            for (int j = 0; j < i; j++) {
                if (gameNumbers[i] == gameNumbers[j]) {
                    i--;
                }
            }
        }

        for (int i = 0; i < GAME_COUNT; i++) {
            System.out.print(gameNumbers[i]);
        }
        System.out.println();
    }
}

public class NumberBaseballGame {
    public static void main(String[] args) {
        NumberBaseball ball = new NumberBaseball(3);
        ball.start();
    }
}
