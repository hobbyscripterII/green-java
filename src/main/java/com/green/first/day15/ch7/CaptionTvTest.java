package com.green.first.day15.ch7;

class Tv {
    // 속성, 전역변수: 객체가 살아있을 동안에 계속 유지된다.
    boolean power;
    int channel;

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

class CaptionTv extends Tv {
    boolean caption;

    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }

    @Override
    void channelUp() {
        channel += 2;
    }
}

public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv captionTv = new CaptionTv();
//        System.out.printf("captionTv.power = %b\n", captionTv.power);
//        captionTv.power();
//        System.out.printf("captionTv.power = %b\n", captionTv.power);
//        captionTv.power();
//        System.out.printf("captionTv.power = %b\n", captionTv.power);

        captionTv.channel = 10;
        captionTv.channelUp(); // 부모 객체의 메소드를 찾아 실행한다.(부모 객체를 찾아 올라간다)
        System.out.println("captionTv.channel = " + captionTv.channel);

        captionTv.displayCaption("점심 뭐먹지?"); // 출력 X
        System.out.println("--------------------");
        captionTv.caption = true;
        captionTv.displayCaption("점심 뭐먹지?");
    }
}