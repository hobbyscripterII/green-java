package com.green.second.ch4;

class ScoreBoxOpt {
    private int score;

    public void setScore(int score) {
        this.score = score;
    }

    String getSign(int score) {
        score = score % 10;
        return score >= 8 ? "+" : (score <= 3 ? "-" : "0");
    }

    public String getGrade() {
        if (score == 100) {
            return "A+";
        } else if (score >= 90) {
            return "A" + getSign(score);
        } else if (score >= 80) {
            return "B" + getSign(score);
        } else {
            return "C";
        }
    }
}

public class FlowEx5 {
    public static void main(String[] args) {
        ScoreBoxOpt scoreBoxOpt = new ScoreBoxOpt();
        // 멤버 필드 이름이 `score`라는 것과 멤버 필드의 타입이 `int`라는 것을 알 수 있다.
        scoreBoxOpt.setScore(100);
        ScoreBoxOpt scoreBoxOpt2 = new ScoreBoxOpt();
        scoreBoxOpt2.setScore(72);

        String grade1 = scoreBoxOpt.getGrade();
        String grade2 = scoreBoxOpt2.getGrade();

        System.out.println(grade1);
        System.out.println(grade2);
    }
}