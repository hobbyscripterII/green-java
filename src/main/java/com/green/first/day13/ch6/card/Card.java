package com.green.first.day13.ch6.card;

class Card {
    String pattern;
    String denomination;

    void printYourSelf() {
        System.out.printf("%s - %s\n", pattern, denomination);
    }
}