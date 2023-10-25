package com.green.first.day15.ch7;

class Card {
    static final int KIND_MAX = 4;
    static final int NUM_MAX = 13;
    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;
    int kind, number;

    public Card() {
        this(SPADE, 7);
    }

    public Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }
}

class Deck extends Card {
    final int CARD_NUM = 52;
    Card[] arr = new Card[CARD_NUM]; // // 카드 객체의 주소값만 담을 수 있는 배열, 명시적 초기화

    public Deck() {
        init();
    }

    void init() {
        int[] kind = {CLOVER, HEART, DIAMOND, SPADE};
        int cnt = 0;
        for (int i = 0; i < KIND_MAX; i++) {
            for (int j = 1; j <= NUM_MAX; j++) {
//                Card card = new Card();
//                card.kind = kind[i];
//                card.number = j;
                arr[cnt++] = new Card(kind[i], j);
            }
        }
    }

//    @Override
//    public String toString() { // Object의 'toString'을 오버라이딩한다.
//        return String.format("kind = %d, number = %d\n", kind, number);
//    }

    void printCard() {
        for (Card card : arr) {
            System.out.printf("kind = %d, number = %d\n", card.kind, card.number);
        }
    }

    Card pick(int val) {
        return arr[val];
    }

    Card pick() {
        return arr[(int) (Math.random() * (CARD_NUM))];
    }

    void shuffle() {
        for (int i = 0; i < CARD_NUM; i++) {
            int random = (int) (Math.random() * CARD_NUM);
            Card card = arr[i]; // 백업
            arr[i] = arr[random];
            arr[random] = card;
        }
    }
}

public class DeckTest {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        // 검증
        deck.printCard();
    }
}
