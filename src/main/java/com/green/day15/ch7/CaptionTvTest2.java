package com.green.day15.ch7;

class Tv2 {
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

class CaptionTv2 extends Tv2 {
    int channel;
    boolean caption;

    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }

    void printParentChannel(int channel) {
        System.out.println("channel = " + this.channel); // 10, CaptionTv2, CaptionTv2에 'channel'이 없을 경우 부모 클래스까지 올라간다.(상속받았기 때문)
        System.out.println("channel = " + super.channel); // 1, Tv
        System.out.println("channel = " + channel); // 10, printParentChannel()
    }
}

public class CaptionTvTest2 {
    public static void main(String[] args) {
        CaptionTv2 captionTv2 = new CaptionTv2();
        captionTv2.channel = 10; // 자식 클래스의 'channel'의 값이 변경된다.
        // 자식 클래스에 메소드가 없기 때문에 부모 클래스까지 올라가는데 부모 클래스에 'channel' 변수명이 있기 때문에 부모 클래스에 있는 값이 '++'된다.
        captionTv2.channelUp(); // ++1
        System.out.println("captionTv2.channel = " + captionTv2.channel); // 10
        // 자식 클래스에 'printParentChannel()' 생성 이후 ...
//        captionTv2.printParentChannel(); // 1
    }
}