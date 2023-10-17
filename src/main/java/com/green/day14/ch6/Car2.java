package com.green.day14.ch6;

public class Car2 {
    String color, gearType;
    int door;

    public Car2() {

    }

    public Car2(Car2 car2) {
//        this.color = color;
//        this.gearType = gearType;
//        this.door = door;

        color = car2.color;
        gearType = car2.gearType;
        door = car2.door;
    }

    public void printYourSelf() {
        System.out.printf("%s %s %d\n", color, gearType, door);
    }
}

class Car2Test {
    public static void main(String[] args) {
        Car2 car1 = new Car2();
        car1.color = "black";
        car1.gearType = "manual";
        car1.door = 5;

        Car2 car2 = new Car2(car1);

        car1.printYourSelf(); // black, manual, 5
        car1.printYourSelf(); // black, manual, 5
    }
}