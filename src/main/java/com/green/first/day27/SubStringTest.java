package com.green.first.day27;

public class SubStringTest {
    public static void main(String[] args) {
        String str = "ABCDEFGHIJK";
        // `C`부터 `E` 앞까지 출력된다.
        System.out.println(str.substring(2, 4));
        // `E`부터 끝까지 출력된다.
        System.out.println(str.substring(4));
    }
}
