package com.green.second.ch4;

class MyUtils {
    public static int abs(int val) {
        return val < 0 ? -val : val;
    }

    public static int randomVal(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static int sumFromTo(int val1, int val2) {
        int sum = 0;
        for (int i = val1; i <= val2; i++) {
            sum += i;
        }
        return sum;
    }

    public static String gugudan(int val) {
        String gugudan = ""; // 지역변수는 무조건 초기화하고 사용해야 한다.
        for (int i = 1; i <= 9; i++) {
            // for문에서 `문자열 합치기`는 좋지않다.
            gugudan += String.format("%d X %d = %d\n", val, i, val * i);
        }
        return gugudan;
    }

    public static String gugudan2(int val) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= 9; i++) {
            stringBuilder.append(String.format("%d X %d = %d\n", val, i, val * i));
        }
        return stringBuilder.toString();
    }
}

public class FlowEx32 {
    public static void main(String[] args) {
//        int val = MyUtils.abs(10);
//        int val2 = MyUtils.abs(-10);
//        int val3 = MyUtils.abs(20);
//        int val4 = MyUtils.abs(22);
//        System.out.println(val);
//        System.out.println(val2);
//        System.out.println(val3);
//        System.out.println(val4);
//
//        int rNum = MyUtils.randomVal(20, 50);
//        System.out.println(rNum);
//
//        int sum = MyUtils.sumFromTo(10, 30);
//        int sum2 = MyUtils.sumFromTo(12, 32);
//        System.out.println(sum);
//        System.out.println(sum2);

        String gugudan3 = MyUtils.gugudan2(3);
        System.out.println(gugudan3);
    }
}
