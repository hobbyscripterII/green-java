package com.green.first.day14.ch6;

public class Car {
    String color; // 객체가 살아있는 동안에는 살아있다.
    String gearType; // auto, manual
    int door;

    public Car() {
        this("white");
    } // * 기본 생성자

    // 입력한 값이 없을 경우에는 디폴트 값을 셋팅한다.
    public Car(String color) {
        this(color, "auto", 4);
    } // * 파라미터가 있는 생성자, 오버로딩된 생성자

    public Car(String color, String gearType, int door) {
        this.color = color; // 메소드가 종료되면 죽는다.
        this.gearType = gearType;
        this.door = door;
    }

//    public Car() {
//        // 전역변수, 지역변수 이름 겹치는 게 없기 때문에 'this' 키워드 생략이 가능하다.
//        color = "white";
//        gearType = "auto";
//        door = 4;
//    }
//
//    public Car(String color) {
//        this(); // this()는 생성자 상단에만 올 수 있다.
//        this.color = color;
//    }

    void printMySelf() {
        System.out.printf("color = %s, gearType = %s, door = %d\n", color, gearType, door);
    }
}