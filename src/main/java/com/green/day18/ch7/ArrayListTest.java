package com.green.day18.ch7;

import com.green.day12.ch6.Card;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        // 자식 객체는 부모 객체를 담을 수 있다.(다형성)
        // 여기서 부모 객체는 `List`가 된다.
        List list = new ArrayList<>();
        list.add(10);
        list.add(10.5f); // float
        list.add(10.3); // double
        list.add(10L);
        list.add("String");
        list.add(new Card());
    }
}

class ArrayListTest2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList(); // 정수 값만 들어간다.
        list.add(10);
//        list.add("초코파이"); // ERROR
        int val = list.get(0); // 지네릭 타입을 `Integer`로 줬기 때문에 형변환 생략이 가능하다.
//        int val2 = list.get(1); // ERROR
        list.add(20);
        int val3 = list.get(1); // ERROR

        System.out.println(list.size()); // list의 length를 반환한다.
    }
}

class ArrayListTest3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);
        list.add(1, 100); // `1`번 인덱스에 `100`을 넣고 `1`번 인덱스 이후의 값들을 뒤로 민다.
        System.out.println(list);
        list.add(2, 300);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
}
