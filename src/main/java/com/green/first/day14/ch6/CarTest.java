package com.green.first.day14.ch6;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("hot pink");

        car1.printMySelf(); // white, auto, 4
        car2.printMySelf(); // blue, auto, 4
    }
}