package com.green.day14.ch6;

public class CardDeck {
    Card[] cards;

    void printAll() {
//        for (Card card : cards) {
//            System.out.printf("%s (%s)\n", card.pattern, card.denomination);
//        }

        for (Card card : cards) {
            card.printMySelf();
        }
    }

    public CardDeck() {
        init();
    }

    Card getCard() {
        Card card = null;
        while (true) {
            int idx = (int) (Math.random() * cards.length);
            card = cards[idx];
            if (card != null) {
                cards[idx] = null;
                break;
            }
        }
        return card;
    }

//    Card getCard() {
//        final int LENGTH = 52;
//        int random = (int) (Math.random() * LENGTH);
//        Card card = new Card(cards[random].pattern, cards[random].denomination);
//
//        if (cards[random].pattern == null && cards[random].denomination == null) {
//            random = (int) (Math.random() * LENGTH);
//            card = new Card(cards[random].pattern, cards[random].denomination);
//        } else {
//            cards[random].pattern = null;
//            cards[random].denomination = null;
//        }
//
//        System.out.println(card.pattern + card.denomination);
//        return card;
//    }

    private void init() {
        cards = new Card[52];
        String[] patterns = {"Spade", "Heart", "Diamond", "Club"};
        int idx = 0;

        for (int i = 0; i < patterns.length; i++) {
            String pattern = patterns[i];

            for (int j = 1; j <= 13; j++) {
                String denomination = this.getNumberFromInt(j);
                cards[idx++] = new Card(pattern, denomination);
            }
        }
    }

    private String getNumberFromInt(int val) {
        if (val == 1) return "A";
        if (val == 11) return "J";
        if (val == 12) return "Q";
        if (val == 13) return "K";
        else return String.valueOf(val);
    }
}
