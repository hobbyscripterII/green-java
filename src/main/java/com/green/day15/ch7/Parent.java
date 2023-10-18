package com.green.day15.ch7;

public class Parent extends Object {
    int age;

    public Parent() {

    }

    public Parent(int age) {
        this.age = age;
    }
}

class Child extends Parent {
    public Child() {
        super();
    }

    void play() {
        System.out.println("놀자!");
    }
}

class Child2 extends Parent {
    public Child2() {
//        super(); // 부모 클래스에 기본 생성자가 없을 경우 에러가 발생한다.
        super(12);
    }

    void jump() {
        // 객체 생성시 age에 '12'로 초기화되었다가 객체 생성 이후 '12'로 변경되기 때문에 '11'이 출력된다.
        System.out.printf("%d살의 아이가 점프를 합니다.", age);
    }
}

class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.play();

        Child2 child2 = new Child2();
        child2.age = 11;
        child2.jump();
    }
}