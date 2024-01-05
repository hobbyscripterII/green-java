package com.green.first.day68.ch14;

//@FunctionalInterface // 해당 어노테이션을 등록할 때는 추상 메소드가 1개만 있어야한다.
interface MyFunction {
    void run(); // 메소드는 'public abstract' 생략
                // 멤버 필드는 'final' 생략
}

interface MyFunction2 {
    void run2(String str);
}

interface MyFunction3 {
    void run3(String str,String str2);
}

interface MyFunction4 {
    void myMethod();
}

class LambdaEx2 {
    public static void main(String[] args) {
        // 인터페이스 상속, 객체 생성, 메소드 호출 3가지를 한 문장으로 끝낸다.
        MyFunction4 mf4 = () -> System.out.println("안녕하세요.");
        mf4.myMethod();
    }
}

public class LambdaEx1 {
    public static void main(String[] args) {
        // 람다식
        // 인터페이스에 추상 메소드가 1개밖에 없기 때문에 어떤 메소드인지 알 수 있다.(run() 메소드를 호출하는 것을 알고있다)

        // 'new MyFunction() public void run()' 문장이 생략 되었다.
        MyFunction mf1 = () -> System.out.println("mf1 - run()");
        MyFunction2 mf2 = s -> {System.out.printf("mf2 - run(%s)\n", s);}; // 파라미터가 1개라면 '()' 생략이 가능하다.
        MyFunction3 mf3 = (s, s2) -> {System.out.printf("mf3 - run(%s, %s)\n", s, s2);}; // 파라미터가 2개라면 '()' 생략이 불가능하다.

        String s = "hi", s2 = "bye";
        mf1.run();
        mf2.run2(s);
        mf3.run3(s, s2);

        MyFunction mf0 = new MyFunction() { // 익명 클래스를 객체화한다.
            @Override
            public void run() {
                System.out.println("mf1 - run()");
            }
        };

//        MyFunction mf2 = new MyFunctionClass(); // 생략 가능
//        mf2.run();
    }
}

//class MyFunctionClass implements MyFunction { // 생략 가능
//    public void run() {
//        System.out.println("MyFunctionClass - run()");
//    }
//}
