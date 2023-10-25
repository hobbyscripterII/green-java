package com.green.first.day12.ch6;

public class Gugudan {
    void print(int val) {
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d X %d = %d\n", val, i, val * i);
        }
    }

    void printFromTo(int val1, int val2) {
        for (int i = val1; i <= val2; i++) {
            print(i);
        }
    }

    void printFromTo(int val1, int val2, String seq) {
        for (int i = val1; i <= val2; i++) {
            print(i);
            if (i <= val2 - 1) {
                System.out.println(seq);
            }
        }
    }
}
