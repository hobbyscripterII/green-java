package com.green.first.day13.ch6.card;

public class CardTestResult2 {
    public static void main(String[] args) {
        Card[] cards = makeCards();

        for (Card card : cards) {
            card.printYourSelf();
        }
    }

    static String getNumberFromInt(int val) {
        switch (val) {
            case 0:
                return "K";
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
        }
        return String.valueOf(val);
    }

    static Card[] makeCards() {
        Card[] cards = new Card[52];
        String[] kinds = {"Spade", "Heart", "Diamond", "Club"};

        for (int i = 0; i < cards.length; i++) {
            String pattern = kinds[i / 13];
            String denomination = getNumberFromInt((i % 13));
            cards[i] = new Card();
            cards[i].pattern = pattern;
            cards[i].denomination = denomination;
        }
        return cards;
    }
}
