package com.green.first.day10.ch6;

public class TvTest2 {
    public static void main(String[] args) {
        Tv tv1 = new Tv();
        System.out.println(tv1.channel);
        tv1.channelUp();
        System.out.println(tv1.channel);
    }
}
