package com.green.second.ch3;

public class OperatorEx18 {
    public static void main(String[] args) {
        float f1 = 15.0f;
        float f2 = 15.1f;
        float f3 = 15.5f;
        float f4 = 15.9f;

        // ceil (올림) > double
        System.out.printf("ceil(%f) - %f\n", f1, Math.ceil(f1));
        System.out.printf("ceil(%f) - %f\n", f2, Math.ceil(f2));
        System.out.printf("ceil(%f) - %f\n", f3, Math.ceil(f3));
        System.out.printf("ceil(%f) - %f\n", f4, Math.ceil(f4));
        // floor (내림) > double
        System.out.printf("floor(%f) - %f\n", f1, Math.floor(f1));
        System.out.printf("floor(%f) - %f\n", f2, Math.floor(f2));
        System.out.printf("floor(%f) - %f\n", f3, Math.floor(f3));
        System.out.printf("floor(%f) - %f\n", f4, Math.floor(f4));
        // round (반올림) > long
        System.out.printf("round(%f) - %d\n", f1, Math.round(f1));
        System.out.printf("round(%f) - %d\n", f2, Math.round(f2));
        System.out.printf("round(%f) - %d\n", f3, Math.round(f3));
        System.out.printf("round(%f) - %d\n", f4, Math.round(f4));
    }
}
