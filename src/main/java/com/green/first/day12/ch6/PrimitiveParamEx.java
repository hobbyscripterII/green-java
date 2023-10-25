package com.green.first.day12.ch6;

class Data {
    int x;
}

public class PrimitiveParamEx {
    public static void main(String[] args) {
        Data data = new Data();
        data.x = 100;
        System.out.println("1. data.x = " + data.x);
        change(data);
        System.out.println("2. data.x = " + data.x);

        Data data2 = new Data();
        data2.x = 100;

    }

    public static void change(int d) {
        d = 1000;
    }

    public static void change(Data data) {
        data = new Data();
        data.x = 1000;
        System.out.println("3. data.x = " + data.x);
    }
}
