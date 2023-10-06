package com.green.day7.ch4;

public class FlowEx30 {
    public static void main(String[] args) {
        final int TARGET = 100; // 리터럴 값은 변수를 생성해서 쓰는 게 좋다. / 매직 넘버라고 부른다.
        // 문제: sum이 100 초과되는 시점의 i값을 구한다.
        int sum = 0;
        for (int i = 0; sum < TARGET; i++) {
            sum += i;
            System.out.printf("i = {%d}, sum = {%d}\n", i, sum);
        }
    }
}