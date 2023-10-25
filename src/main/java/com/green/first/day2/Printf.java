package com.green.first.day2;

public class Printf {
    public static void main(String[] args) {
        System.out.print("HELLO");
        System.out.print("HELLO");
        System.out.print("HELLO");
        System.out.print("HELLO");
        System.out.print("HELLO \n");
        System.out.println(">>>>>");
        System.out.print("HELLO \n");
        System.out.print("HELLO \n");
        System.out.print("HELLO \n");
        System.out.print("HELLO \n");
        System.out.print("HELLO \n");

        String name = "홍길동";
        int age= 20;
        char bloodType = 'B';
        float height = 178.8f;

        // s: String, d: int, c: char, float: fcm
        System.out.printf("제 이름은 %s이고, 나이는 %d세이고, 혈액형은 %c형이고, 키는 %fcm입니다.", name, age, bloodType, height);

//        System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "세이고, 혈액형은 " + bloodType + "이고, 키는 " +height + "입니다." );
    }
}
