package com.green.first.day4.ch4;

public class RandomVal {
    public static void main(String[] args) {
        double valDouble = Math.random();
        System.out.println("valDouble = " + valDouble);

        // 최대 값 0 ~ 9
        int valInt = (int)(valDouble * 10);// () 괄호를 치면 **연산이 끝난 후,** int로 형변환한다. , 최대 값은 해당 값의 -1이다.
        System.out.println("valInt = " + valInt);

        // 최대 값 0 ~ 19
        int randomValue = (int) (Math.random() * 20);
        System.out.println("randomValue = " + randomValue);
    }
}
