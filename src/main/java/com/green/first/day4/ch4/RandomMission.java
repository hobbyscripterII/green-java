package com.green.first.day4.ch4;

public class RandomMission {
    public static void main(String[] args) {
        int randomValue = (int)(Math.random() * 6) + 5; // 5 ~ 10
        System.out.println("randomValue = " + randomValue);

        // 10 + 14: 24 - 1
        while (true) {
            int randomValue2 = (int)(Math.random() * 10) + 14;
            System.out.println("randomValue2 = " + randomValue2);
        }
    }
}