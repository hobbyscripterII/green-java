package com.green.first.day10.ch6;

public class MethodExamTest {
    public static void main(String[] args) {
        MethodExam me = new MethodExam();
//        me.checkZero(10);
//        me.checkZero(0);

//        for (int i = 0; i < 100; i++) {
//            int r1 = me.randomValFromTo(10, 100);
////            int r2 = me.randomValFromTo(5, 9);
//            System.out.println(r1);
////            System.out.println(r2);
//        }

        me.scoreResultPrint(101);
        me.scoreResultPrint(100);
        me.scoreResultPrint(90);
        me.scoreResultPrint(89);
        me.scoreResultPrint(80);
        me.scoreResultPrint(79);
        me.scoreResultPrint(69);
        me.scoreResultPrint(-1);
    }
}
