package com.green.first.day10.ch6;

public class NumberBox {
    void sum(int n1, int n2) {
        System.out.printf("%d + %d = %d\n", n1, n2, (n1 + n2));
    }

    void minus(int n1, int n2) {
        System.out.printf("%d - %d = %d\n", n1, n2, (n1 - n2));
    }

    void abs(int n1) {
        System.out.printf("%d\n", n1 < 0 ? -n1 : n1);
    }
}