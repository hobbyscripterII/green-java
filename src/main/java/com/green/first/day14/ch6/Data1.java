package com.green.first.day14.ch6;

class ConstructorTest {

    public static void main(String[] args) {
        Data1 data1 = new Data1();
        data1.printMySelf();
        Data1 data2 = new Data1(10, 20, 30);
        data2.printMySelf();
    }
}

public class Data1 {
    // 명시적 초기화
//    int val1 = 100;
//    int val2 = 200;
//    int val3 = 300;

    int val1, val2, val3;
    int a, b, c;

    public Data1() {
//        val1 = 100;
//        val2 = 200;
//        val3 = 300;

        this(100, 200, 300); // 밑에 파라미터 생성자를 호출한다.
    }

    public Data1(int a, int b, int c) {
        val1 = a;
        val2 = b;
        val3 = c;
    }

    public void printMySelf() {
        System.out.printf("val1 = %d, val2 = %d, val3 = %d\n", val1, val2, val3);
    }
}
