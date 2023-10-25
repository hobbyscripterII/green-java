package com.green.second.ch2;

public class CastingEx1 {
    public static void main(String[] args) {
        byte v1 = 10;
        short v2 = 20;
        int v3 = 30;
        long v4 = 40;
        float v5 = 50.1f;
        double v6 = 50.1;

        v2 = v1;
        v3 = v2;
        v4 = v3;
        v5 = v4;
        v6 = v5;
    }
}
