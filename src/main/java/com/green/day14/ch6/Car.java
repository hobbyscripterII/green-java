package com.green.day14.ch6;

public class Car {
    String color;
    String gearType; // auto, manual
    int door;

    public Car() {
        this("white");
    }

    // 입력한 값이 없을 경우에는 디폴트 값을 셋팅한다.
    public Car(String color) {
        this(color, "auto", 4);
    }

    public Car(String color, String gearType, int door) {
        this.color = color;
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