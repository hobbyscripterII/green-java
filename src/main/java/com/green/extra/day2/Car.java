package com.green.extra.day2;

public class Car {
    // private 멤버 변수에 값 넣기
    private String name;
    private int door;
    private String color;

    Car() {

    }

    // 1. 생성자
    Car(String name, int door, String color) {
        this.name = name;
        this.door = door;
        this.color = color;

        System.out.printf("name: %s, door: %d, color: %s", name, door, color);
    }

    // 2. Setter
    // setter(): private한 속성의 값을 변경한다.
    public void setName(String name) {
        this.name = name;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // getter(): prviate한 속성의 값을 가져온다.
    public String getName() {
        return name;
    }

    public int getDoor() {
        return door;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return String.format("name: %s, door: %d, color: %s", name, door, color);
    }
}

class CarTest {
    public static void main(String[] args) {
//        Car car = new Car("볼보", 4, "Blue");

        Car car = new Car();
        car.setName("제네시스");
        car.setDoor(4);
        car.setColor("Black");
        // 객체 주소값을 println에 보낸다.
//        System.out.println(car);

        System.out.println(car.getName());
    }
}
