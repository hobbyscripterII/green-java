package com.green.day12.ch6;

public class ReperenceParamEx2 {
    public static void main(String[] args) {
        int[] x = {10};
        System.out.println("x[0] = " + x[0]);
        change(x);
        System.out.println("x[0] = " + x[0]);
    }

    static void change(int[] x) {
        x[0] = 20;
    }
}