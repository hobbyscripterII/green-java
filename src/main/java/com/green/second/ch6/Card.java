package com.green.second.ch6;

public class Card {
    private String pattern;
    private String denomination;

    // 생성자는 리턴 타입이 없으며 이름이 클래스명과 동일해야 한다.
    public Card(String pattern, String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
//        System.out.printf("pattern = {%s}, denomination = {%s}", pattern, denomination);
    }

    @Override
    public String toString() {
        return String.format("%s(%s)", pattern, denomination);
    }
}
