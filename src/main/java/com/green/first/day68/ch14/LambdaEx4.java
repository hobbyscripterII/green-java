package com.green.first.day68.ch14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaEx4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i + 10); // 0 ~ 9
        }

        for (Integer i : list) {
            System.out.println(i); // 0 ~ 9 출력
        }

        System.out.println(">>>>>");
        // forEach에는 Consumer 인터페이스를 implements한 클래스만 들어와야 한다.
        list.forEach(new MyConsumer<Integer>());
        System.out.println(">>>>>");
        // 방법 1 - 익명 클래스를 호출한다.
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println("MyConsumer(2) = " + i);
            }
        });
        // 방법 2 - 람다를 사용한다.
        list.forEach(i -> System.out.println("MyConsumer(3) = " + i));
        System.out.println(">>>>>");
        // removeIf
        // 파괴 메소드, 원본을 건든다.
        // 조건식이 true일 경우 값을 삭제한다.
        list.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                return i % 2 == 0;
            }
        });

//        list.removeIf(i -> i % 2 == 0);         // 1. return이 없을 경우 {} 중괄호 생략이 가능하다.
        list.removeIf(i -> {return i % 2 == 0;}); // 2. return이 있을 경우 {} 생략이 불가능하다.
    }
}

class MyConsumer<T> implements Consumer<T> {
    @Override
    public void accept(T t) {
        // T - 어떠한 타입이 될 수 있다.
        // 컴파일하는 시점에 타입이 정해진다.
        System.out.println("MyConsumer(1) = " + t);
    }
}
