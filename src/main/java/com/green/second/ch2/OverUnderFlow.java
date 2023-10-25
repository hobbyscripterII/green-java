package com.green.second.ch2;

public class OverUnderFlow {
    public static void main(String[] args) {
        // overflow: 해당 타입이 표현할 수 있는 값의 범위를 넘어서는 것을 의미한다.
        short s1 = 129;
//        byte b1 = s1; // ERROR
        // byte는 `128`까지 허용한다.
        byte b1 = (byte) s1; // 강제 형변환
        System.out.printf("b1 = {%d}\n", b1); // -127

        s1 = -129;
        b1 = 0;

        // 오버플로우, 언더플로우가 발생하지 않게 하려면 if문을 사용하는 게 맞다.
        if (Byte.MAX_VALUE >= s1 && Byte.MIN_VALUE <= s1) { // Byte: static class, MAX_VALUE: final static 멤버 필드
            b1 = (byte) s1;
        }

        System.out.printf("b1 = {%d}\n", b1); // -128
    }
}
