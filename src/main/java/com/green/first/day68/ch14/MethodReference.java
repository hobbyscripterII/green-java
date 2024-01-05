package com.green.first.day68.ch14;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReference {
    public static void main(String[] args) {
        // <String, Integer> -> <parameter 타입, return 타입>
        Function<String, Integer> f = v -> Integer.parseInt(v);
        Function<String, Integer> f2 = Integer::parseInt;

        System.out.println(f.apply("12") + 1);
        System.out.println(f2.apply("12") + 1);

        BiFunction<String, String, Boolean> bf = (s1, s2) -> s1.equals(s2);
        BiFunction<String, String, Boolean> bf2 = String::equals;

        String s1 = new String("안녕");
        String s2 = new String("안녕");
        System.out.println("s1 == s2: " + (s1 == s2)); // 객체의 주소값이 다르기 때문에 false가 출력된다.
        System.out.println(bf.apply(s1, s2));
        System.out.println(bf2.apply(s1, s2));
    }
}
