package com.green.day12.ch6;

public class CardTest {
    public static void main(String[] args) {
        Card c1 = new Card();
        c1.kind = "Spade";
        c1.number = "A";

        Card c2 = new Card();
        c2.kind = "Heart";
        c2.number = "10";

        Card c3 = new Card();
        c3.kind = "Clover";
        c3.number = "A";

        System.out.println("(c1==c2) = " + (c1 == c2));
        c1 = c2; // 같은 주소값을 참조한다.
        System.out.println("(c1==c2) = " + (c1 == c2));
        System.out.println("c1.kind = " + c1.kind);
        System.out.println("c2.kind = " + c2.kind);

        /*
        A: 1, J: 11, Q: 12, K: 13
        "2" > 2
        "3" > 3
        ...
        "10" > 10
         */
        System.out.println(c1.getScore());
        System.out.println(c2.getScore());
        System.out.println(c3.getScore());
    }
}
