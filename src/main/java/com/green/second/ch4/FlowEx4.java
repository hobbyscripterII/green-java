package com.green.second.ch4;

class ScoreBox {
    private int score;

    public ScoreBox(int score) {
        this.score = score;
    }

    void printGrade() {
        System.out.print(score >= 90 ? "A" : (score >= 80 ? "B" : (score >= 70 ? "C" : "D")));
        System.out.print("학점\n");
    }
}

public class FlowEx4 {
    public static void main(String[] args) {
        ScoreBox scoreBox1 = new ScoreBox(90);
        ScoreBox scoreBox2 = new ScoreBox(100);

        ScoreBox scoreBox3 = new ScoreBox(50);
        ScoreBox scoreBox4 = new ScoreBox(70);

        scoreBox1.printGrade();
        scoreBox2.printGrade();
        scoreBox3.printGrade();
        scoreBox4.printGrade();

    }
}
