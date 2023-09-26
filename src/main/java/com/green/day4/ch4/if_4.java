package com.green.day4.ch4;

public class if_4 {
    public static void main(String[] args) {
        int val = (int) (Math.random() * 151) + 50;
        System.out.printf("val = {%d}, result = {%d}", val, val < 100 ? val * 2 : val + 10);
    }
}