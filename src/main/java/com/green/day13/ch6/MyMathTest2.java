package com.green.day13.ch6;

public class MyMathTest2 {
    public static void main(String[] args) {
        MyMath2 myMath2 = new MyMath2();
        myMath2.num = 10;
        myMath2.staticNum = 30;

        MyMath2 myMath21 = new MyMath2();
        myMath21.num = 100;
        myMath21.staticNum = 50;

        // * 이렇게 사용하진 않는다.
        System.out.printf("myMath2.num = %d\n", myMath2.num);
        System.out.printf("myMath2.staticNum = %d\n", myMath2.staticNum);

        System.out.printf("myMath21.num = %d\n", myMath21.num);
        System.out.printf("myMath21.staticNum = %d\n", myMath2.staticNum);
        System.out.printf("myMath21.staticNum = %d\n", myMath21.staticNum);

        // * 주로 이렇게 사용한다.
        // 객체 생성과는 전혀 상관이 없으며 클래스 이름으로 접근할 수 있다.
        System.out.println("MyMath2.staticNum = " + MyMath2.staticNum);
    }
}
