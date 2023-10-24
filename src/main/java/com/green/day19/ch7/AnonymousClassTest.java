package com.green.day19.ch7;

public class AnonymousClassTest {
    public static void main(String[] args) {
//        Runnable2 runnable2 = new RunRobot();
//        runnable2.run();

        // 익명 클래스
        Runnable2 runnable2 = new Runnable2() {
            @Override
            public void run() {
                System.out.println("출력되나");
            }
        };
    }
}

interface Runnable2 {
    void run();
}

class RunRobot implements Runnable2 {
    @Override
    public void run() {
        System.out.println("로봇이 달립니다.");
    }
}