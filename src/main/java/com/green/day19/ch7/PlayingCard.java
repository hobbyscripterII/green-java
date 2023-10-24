package com.green.day19.ch7;

public interface PlayingCard {
    // 인터페이스에 선언하는 멤버 필드는 모두 `상수`이다.
    public static final int SPADE = 4; // 인터페이스의 멤버 변수는 모두 `public static final`가 들어간다.
    final int DIAMOND = 3;
    static int HEART = 2;
    int CLOVER = 1;

    String getCardNumber();
    String getCardKind();
}

class Card implements PlayingCard {
    @Override
    public String getCardNumber() {
        return null;
    }

    @Override
    public String getCardKind() {
        return null;
    }
}

class PlayingCardTest {
    public static void main(String[] args) {
        System.out.println(PlayingCard.CLOVER);
    }
}

// 상속도 가능하다.
interface PlayingChess extends PlayingCard {
    void moveHorse(int x, int y);
}

class Chess implements PlayingChess {
    @Override
    public String getCardNumber() {
        return null;
    }

    @Override
    public String getCardKind() {
        return null;
    }

    @Override
    public void moveHorse(int x, int y) {

    }
}