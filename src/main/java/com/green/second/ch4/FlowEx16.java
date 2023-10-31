package com.green.second.ch4;

import java.util.Enumeration;

class MyStar {
    public static String star(int val) {
//        StringBuilder stringBuilder = new StringBuilder(" "); // 초기화가 가능하다.
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < val; i++) {
            stringBuilder.append("*");
        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    public static String multiStar(int val) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < val; i++) {
            for (int j = 0; j < val; j++) {
                stringBuilder.append("*");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public static String multiStar2(int val) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < val; i++) {
            stringBuilder.append(star(val));
        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    public static String triangleStar(int val) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= val; i++) {
            stringBuilder.append(star(i));
        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }
}

public class FlowEx16 {
    public static void main(String[] args) {
//        String line = MyStar.star(5);
//        String line2 = MyStar.star(6);
//        System.out.print(line);
//        System.out.print(line2);

//        String line3 = MyStar.multiStar(4);
//        System.out.println(line3);

        String line4 = MyStar.triangleStar(5);
        System.out.println(line4);
    }
}
