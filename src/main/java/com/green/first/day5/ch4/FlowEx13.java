package com.green.first.day5.ch4;

public class FlowEx13 {
    public static void main(String[] args) {
        int result = 0;
        for(int i = 1; i <= 10; i++) {
            result += i;
            System.out.printf("i = {%s}\n", i);
        }
        System.out.printf("result = {%d}", result);
    }
}
