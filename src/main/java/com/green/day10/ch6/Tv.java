package com.green.day10.ch6;

public class Tv {
    // 속성, 멤버 필드, property
    String color;
    boolean power;
    int channel;

    // 메소드
    // 리턴타입 메소드명 매개변수(파라미터)
    void power() {
        power = !power;
    }

    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }
}
