package com.green.first.day13.ch6.card;

import com.green.first.day12.ch6.Card;

public class CardTestResult1 {
    public static void main(String[] args) {
        Card[] cards = makeCards();
        System.out.println("cards.length = " + cards.length);

        for (Card card : cards) {
            card.printYourSelf();
        }
    }

    static Card[] makeCards() {
        Card[] cards = new Card[52];
        String[] kinds = {"Spade", "Heart", "Diamond", "Club"};
        int cnt = 0;

        for (int i = 0; i < kinds.length; i++) {
            for (int z = 1; z <= 13; z++) {
                String number = getNumberFromInt(z);
                Card card = new Card();
                card.kind = kinds[i];
                card.number = number;
                cards[cnt++] = card;
            }
        }
        return cards;
    }

    static String getNumberFromInt(int val) {
        switch (val) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
        }
        return String.valueOf(val);
    }
}
