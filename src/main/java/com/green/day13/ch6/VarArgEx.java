package com.green.day13.ch6;

public class VarArgEx {
    public static void main(String[] args) {
        sum(10, 20);
        sum(10, 20, 30);
        sum(10, 20, 30, 40);
        sum(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);

    }

    public static void sum(int... n) {
        int result = 0;
        for (int i = 0; i < n.length; i++) {
            result += n[i];
        }
        System.out.println(result);
    }
}
