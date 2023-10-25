package com.green.first.day11.ch6;

public class DiffPriRef {
    public static void main(String[] args) {
        int num = 30;
        changeVal(num);
        System.out.println("num = " + num);

        NumBox nb = new NumBox();
        System.out.println("nb.val = " + nb.val);
        nb.val = 30; // 대입 연산자를 통해 NumBox의 val 값을 변경한다.
        System.out.println("nb.val = " + nb.val);
        changeVal(nb);
        System.out.println("nb.val = " + nb.val);
    }

    public static void changeVal(int val) {
        System.out.println(">>>>> changeVal - int");
        val = 10;
        System.out.println("val = " + val);
    }

    /*
    NumBox nb = new NumBox()와는 다른 존재이다.
    같은 존재라면 changeVal()에서 mb = new Numbox()로 새로운 주소값을 생성했을 때 NumBox nb = new NumBox()의 주소값도 바껴야한다.
    */
    public static void changeVal(NumBox mb) {
        System.out.println(">>>>> changeVal - NumBox");
        mb.val = 50;
//        System.out.println(mb);
        mb = new NumBox();
//        System.out.println(mb);
        mb.val = 20;
    }
}

class NumBox {
    int val;
}
