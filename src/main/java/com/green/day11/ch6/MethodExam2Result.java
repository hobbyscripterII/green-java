package com.green.day11.ch6;

public class MethodExam2Result {
    String scoreResultOpt(int val) {
        if (val < 0 || val > 100) {
            return "점수를 확인해주세요.";
        } else if (val == 100) {
            return "A+학점";
        } else if (val < 70) {
            return "D학점";
        }

        String grade = "C";

        if (val >= 90) {
            grade = "A";
        } else if (val >= 80) {
            grade = "B";
        }

        String opt = " ";
        int modVal = val % 10;
        if (modVal >= 8) {
            opt = "+";
        } else if (modVal <= 3) {
            opt = "-";
        }
        return String.format("%s%s학점", grade, opt);
    }
}
