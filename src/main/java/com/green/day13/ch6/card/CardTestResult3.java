package com.green.day13.ch6.card;

public class CardTestResult3 {
    public static void main(String[] args) {
        Card[] cards = makeCards();

        for (int i = 0; i < cards.length; i++) {
            System.out.printf("%s - %s", cards[i].pattern, cards[i].denomination);
        }
    }

    public static Card[] makeCards() {
        Card[] cards = new Card[52];
        String[] pattern = {"Space", "Heart", "Club", "Diamond"};
        int cnt = 0;

        for (int i = 0; i < pattern.length; i++) {
            for (int j = 1; j <= 13; j++) {
                String denomination = CardFromTo(j);
                Card Card = new Card();
                Card.pattern = pattern[i];
                Card.denomination = denomination;
                cards[cnt++] = Card;
            }
        }
        return cards;
    }

    static String CardFromTo(int j) {
        switch (j) {
            case 1: return "A";
            case 11: return "J";
            case 12: return "Q";
            case 13: return "K";
        }
        return String.valueOf(j);
    }
}