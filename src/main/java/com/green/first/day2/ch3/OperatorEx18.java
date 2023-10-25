package com.green.first.day2.ch3;

public class OperatorEx18 {
    public static void main(String[] args) {
        float f1 = 15.1f;
        float f2 = 15.6f;
        float f3 = 15.9f;

        // ceil: 0.0001이라도 있으면 올림으로 처리한다.
        System.out.printf("ceil(%f) = %f\n", 15.0001, Math.ceil(15.0001));
        System.out.printf("ceil(%f) = %f\n", f1, Math.ceil(f1));
        System.out.printf("ceil(%f) = %f\n", f2, Math.ceil(f2));
        System.out.printf("ceil(%f) = %f\n", f3, Math.ceil(f3));

        // floor: 0.0001이라도 있으면 내림으로 처리한다.
        System.out.printf("floor(%f) = %f\n", 15.0001, Math.floor(15.0001));
        System.out.printf("floor(%f) = %f\n", f1, Math.floor(f1));
        System.out.printf("floor(%f) = %f\n", f2, Math.floor(f2));
        System.out.printf("floor(%f) = %f\n", f3, Math.floor(f3));

        // round:
        System.out.printf("floor(%f) = %d\n", 15.5, Math.round(15.5));
        System.out.printf("round(%f) = %d\n", f1, Math.round(f1));
        System.out.printf("round(%f) = %d\n", f2, Math.round(f2));
        System.out.printf("round(%f) = %d\n", f3, Math.round(f3));
    }
}
