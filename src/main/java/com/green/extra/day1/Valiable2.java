package com.green.extra.day1;

public class Valiable2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 50;

        int temp = x;
        x = y;
        y = temp;

        System.out.printf("x: %d, y: %d\n", x, y);
    }
}
