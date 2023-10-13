package com.green.day10.ch6;

public class MethodExam {
    void checkZero(int i) {
        System.out.printf("%s\n", i == 0 ? "0입니다." : "0이 아닙니다.");
    }

    public int randomValFromTo(int n1, int n2) {
        return (int) (Math.random() * (n2 - n1 + 1)) + n1;
    }

    void scoreResultPrint(int n1) {
        String grade = " ";
        if(n1 > 100 || n1 < 0) {
            grade = "잘못된 점수입니다.";
        } else if(n1 >= 90) {
            grade = "A학점";
        } else if(n1 >= 80) {
            grade = "B학점";
        } else if(n1 >= 70) {
            grade = "C학점";
        } else {
            grade = "D학점";
        }
        System.out.printf("%s\n", grade);
    }
}
