package com.green.first.day1;

public class VarEx2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        int temp = x;
        x = y;
        y = temp ;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}