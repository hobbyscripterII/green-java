package com.green.day6.ch4;

public class DoWhile3 {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++) {
            System.out.println("for = {" + i + "}");
        }

        int i = 0;
        while(i < 10) {
            System.out.println("while = {" + ++i + "}");
        }
    }
}
