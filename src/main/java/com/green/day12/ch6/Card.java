package com.green.day12.ch6;

public class Card {
    String kind;
    String number;

    int getScore() {
        int result = 0;
        if (number.equals("A")) {
            return 1;
        } else if (number.equals("J")) {
            return 11;
        } else if (number.equals("Q")) {
            return 12;
        } else if (number.equals("K")) {
            return 13;
        }
        return Integer.parseInt(number);
    }
}
