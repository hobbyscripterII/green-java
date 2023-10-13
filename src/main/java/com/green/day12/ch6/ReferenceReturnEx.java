package com.green.day12.ch6;

class Data2 {
    int x;
    double d;
}

public class ReferenceReturnEx {
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        d.d = 100.5;
        Data2 d2 = copyObj(d);
        System.out.println("(d==d2) = " + (d == d2));
        System.out.println("(d.x==d2.x) = " + (d.x == d2.x));
        System.out.println("(d.d==d2.d) = " + (d.d == d2.d));
    }

    static Data2 copyObj(Data2 obj) {
        Data2 d2 = new Data2();
        d2.d = obj.d;
        d2.x = obj.x;
        return d2;
    }
}
