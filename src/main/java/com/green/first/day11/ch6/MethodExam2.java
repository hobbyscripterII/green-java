package com.green.first.day11.ch6;

public class MethodExam2 {
    String scoreResultOpt(int val) {
        String score = " ";
        String score_ = " ";
        int result = val % 10;

        if (val > 100 || val < 0) {
            score = "점수를 확인해주세요.";
            return score;
        }
        if (val == 100) {
            score = "A+";
            return score;
        } else if (val >= 90) {
            score = "A";
        } else if (val >= 80) {
            score = "B";
        } else if (val >= 70) {
            score = "C";
        } else {
            score = "D";
        }

        if (result >= 8) {
            score_ = "+";
        } else if (result <= 3) {
            score_ = "-";
        } else {
            score_ = " ";
        }

        return String.format("%s%s학점", score, score_);
//        return score + score_ + "학점";
    }

//    String getSeason(int month) {
//        if (month <= 0 || month > 12) {
//            return "없음";
//        }
//
//        String season = " ";
//        if (month == 3 || month == 4 || month == 5) {
//            season = "봄";
//        } else if (month == 6 || month == 7 || month == 8) {
//            season = "여름";
//        } else if (month == 9 || month == 10 || month == 11) {
//            season = "가을";
//        } else if (month == 12 || month == 1 || month == 2) {
//            season = "겨울";
//        }
//        return season;
//    }

    String getSeason(int month) {
        switch (month) {
            case 3, 4, 5:
                return "봄";
            case 6, 7, 8:
                return "여름";
            case 9, 10, 11:
                return "가을";
            case 12, 1, 2:
                return "겨울";
        }
        return "없음"; // default 없이 return에 작성 가능
    }
}
