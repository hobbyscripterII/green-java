package com.green.day13.ch6.cardRemind;

public class Card {
    static final int LENGTH = 13;
    String pattern;
    String denomination;

    void printCards() {
        System.out.printf("%s - %s\n", pattern, denomination);
    }

    static String getDenomination(int val) {
        String str = String.valueOf(val);
        if (val == 1) str = "A";
        if (val == 11) str = "J";
        if (val == 12) str = "Q";
        if (val == 13) str = "K";
        else return str;
        return str;
    }

    Card[] createCards() {
        Card[] cards = new Card[LENGTH * 4];
        String[] patterns = {"Spade", "Heart", "Diamond", "Club"};
        int cnt = 0;

        for (int i = 0; i < patterns.length; i++) {
            for (int j = 1; j < 14; j++) {
                Card card = new Card();
                card.pattern = patterns[i];
                card.denomination = getDenomination(j);
                cards[cnt++] = card;
            }
        }
        return cards;
    }

    public static void main(String[] args) {
        Card card = new Card();
        Card[] cards = card.createCards();
        for (Card c : cards) {
            c.printCards();
        }
    }
}

