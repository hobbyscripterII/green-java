package com.green.second.ch6;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    private List<Card> cards;
    private final int LENGTH = 13;

    public static String getNumber(int val) {
        String result = String.valueOf(val);
        switch (val) {
            case 1: return "A";
            case 11: return "J";
            case 12: return "Q";
            case 13: return "K";
        }
        return result;
    }

    public CardDeck() {
        cards = new ArrayList();
        String[] patterns = {"Spade", "Heart", "Clob", "Diamond"};

        for (int i = 0; i < patterns.length; i++) {
            for (int j = 1; j <= LENGTH; j++) {
                Card card = new Card(patterns[i], getNumber(j));
                cards.add(card);
            }
        }

        for (Card card : cards) {
            System.out.println(card);
        }
    }
}
