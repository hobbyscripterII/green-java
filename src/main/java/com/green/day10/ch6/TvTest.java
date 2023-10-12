package com.green.day10.ch6;

public class TvTest {
    public static void main(String[] args) {
        // tv1, tv2: TV 객체만 저장할 수 있는 레퍼런스 변수, 참조변수, 저장되는 값은 주소값
        // new Tv(): 주소값이 복사되는 부분
        Tv tv1 = new Tv();
//        tv1.channel = 10;

        Tv tv2 = new Tv();
        tv2.channel = 20;

        System.out.printf("tv1.channel = {%d}\n", tv1.channel); // int default: 0
        System.out.printf("tv2.channel = {%d}\n", tv2.channel);
        System.out.println("tv1 == tv2 = " + (tv1 == tv2));
        tv1.color = "red";
        tv2.color = "black";
        System.out.printf("tv1.color = {%s}\n", tv1.color);
        System.out.printf("tv2.color = {%s}\n", tv2.color);
        System.out.printf("tv1.power = {%s}", tv1.power); // boolean default: false
    }
}
