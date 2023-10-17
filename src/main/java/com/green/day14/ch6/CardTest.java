package com.green.day14.ch6;

public class CardTest {
    public static void main(String[] args) {
        // CardDeck만 호출해도 52장의 카드를 가져야한다.
        CardDeck cardDeck = new CardDeck();
//        cardDeck.printAll();
//        Card card1 = cardDeck.getCard();
//        Card card2 = cardDeck.getCard();

        for (int i = 0; i < 52; i++) {
            Card card = cardDeck.getCard();
            card.printMySelf();
        }
        System.out.println("--------------------");
    }
}