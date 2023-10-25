package com.green.first.day19.ch7;

interface Runnable2 {
    void run();
}

class RunRobotImpl implements Runnable2 {
    @Override
    public void run() {
        System.out.println("로봇이 달립니다.");
    }
}

public class AnonymousClassTest {
    public static void main(String[] args) {
//        Runnable2 runnable2 = new RunRobot();
//        runnable2.run();

        // 익명 클래스
        Runnable2 runnable2 = new Runnable2() {
            @Override
            public void run() {
                System.out.println("익명 로봇이 달립니다.");
            }
        };
        runnable2.run();
    }
}
