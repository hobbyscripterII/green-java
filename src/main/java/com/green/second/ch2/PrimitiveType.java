package com.green.second.ch2;

public class PrimitiveType {
    public static void main(String[] args) {
        boolean b = true;
        b = false;

        byte b1 = 100;
        int n1 = 100;

//        float f = 12.3; // ERROR, double 타입이기 때문에 에러가 발생한다.
        float f = 12.3f;
        float f2 = (float) 12.3;

        double d = 12.3;
        float f3 = (float) d;

        long l = 10000000000L; // 뒤에 `L`을 붙이면 long 타입이 된다.
        int n2 = 10000;
        long l2 = n2;
    }
}
