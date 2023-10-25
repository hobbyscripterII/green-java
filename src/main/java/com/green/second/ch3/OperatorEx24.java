package com.green.second.ch3;

public class OperatorEx24 {
    public static void main(String[] args) {
        System.out.println(true && true && 1 < 0);
        // AND 연산자
        // `false && true`에서 false가 발생하기 때문에 `(10 / 0) == 0`까지 실행되지 않는다.(예외가 발생하지 않는다)
        // false가 먼저 뜰 것 같은 조건문을 앞에 적으면 퍼포먼스가 올라간다.
        System.out.println(false && true && (10 / 0) == 0);

        System.out.println("----------------------------------------");
        // OR 연산자
        // `true`가 먼저 뜰 것 같은 조건문을 앞에 적으면 퍼포먼스가 올라간다.
        System.out.println(true || true || false);
        System.out.println(false || true || false);
        System.out.println(false || false || false);
    }
}
