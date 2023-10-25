package com.green.first.day5.ch4;

public class RandomValMission2 {
    public static void main(String[] args) {
        final int MIN = 10;
        final int MAX = 50;

        // 리터럴 사용 금지

//        while (true) {
//            int val = (int) (Math.random() * (MAX - 9)) + MIN;
//            System.out.println(val);
//        }

        for (int i = 0; i < 1000; i++) {
//            int val = (int) (Math.random() * (MAX - 9)) + MIN;
            int val = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
            System.out.printf("val = {%s}\n", val);
           if(val < MIN || val > MAX) {
               System.out.println("범위를 벗어났습니다.");
               break;
           }
        }
        System.out.println("끝");
    }
}
