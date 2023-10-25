package com.green.first.day11.ch6;

import java.util.Scanner;

public class MethodExam2Test {
    public static void main(String[] args) {
        MethodExam2 me2 = new MethodExam2();
        Scanner s = new Scanner(System.in);

//        System.out.println("점수를 입력하세요.");
//        int score = s.nextInt();
//        String result1 = me2.scoreResultOpt(score);

//        MethodExam2Result me2r = new MethodExam2Result();
//        String result1 = me2r.scoreResultOpt(100);
//        String result2 = me2r.scoreResultOpt(78);
//        System.out.println(result1);
//        System.out.println(result2);

        System.out.println("'월'을 입력하세요.");
        int season_ = s.nextInt();
        String season = me2.getSeason(season_);
        System.out.println(season);
    }
}
