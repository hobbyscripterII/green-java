package com.green.day10.ch6;

public class NumberBoxTest {
    public static void main(String[] args) {
        NumberBox nb = new NumberBox();
        NumberBox nb1 = new NumberBox();
        nb.sum(10, 20);
        nb.sum(30, 40);

        nb1.minus(40, 20);

        nb1.abs(-10);
        nb1.abs(10);
        nb1.abs(33);
        nb1.abs(39);
    }
}
