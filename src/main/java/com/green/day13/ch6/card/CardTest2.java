package com.green.day13.ch6.card;

public class CardTest2 {
    public static void main(String[] args) {
        Card[] cards = makeCards();

        for (Card c : cards) {
            c.printYourSelf();
        }
    }

    static Card[] makeCards() {
        Card[] cards = new Card[52];
        String[] kinds = {"Spade", "Heart", "Diamond", "Club"};
        int cnt = 0;

        for (int i = 0; i < kinds.length; i++) {
            for (int j = 1; j <= 13; j++) {
                Card card = new Card();
                card.pattern = kinds[i];
                card.denomination = getNumber(j);
                cards[cnt++] = card;
            }
        }
        return cards;
    }

    static String getNumber(int val) {
        String str = String.valueOf(val);
        if (val == 1) {
            str = "A";
        } else if (val == 11) {
            str = "J";
        } else if (val == 12) {
            str = "Q";
        } else if (val == 13) {
            str = "K";
        }
        return str;
    }
}
