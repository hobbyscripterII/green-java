package com.green.second.ch2;

public class StringEx {
    public static void main(String[] args) {
        String name = "Ja" + "va"; // 주소값 + 주소값
        System.out.println(name);

        // "12" + "10" + 9
        // "1210" + 9
        // "1210" + "9"
        // "12109"
        String title1 = "12" + 10 + 9; // 정수가 String으로 형변환된다.
        System.out.println(title1);
        String title2 = "12" + (10 + 9);
        System.out.println(title2);

        // equals : 동등성 비교, == : 동일성 비교
//        String str1 = new String("Hello");
//        String str2 = new String("Hello");
//        System.out.println("str1 == str2 : " + (str1 == str2)); // false
//        System.out.println("str1.equals(str2) : " + (str1.equals(str2)));

        Numbox b1 = new Numbox(10);
        Numbox b2 = new Numbox(10);

        System.out.println("b1.getNum() == b2.getNum() : " + (b1.getNum() == b2.getNum()));

//        System.out.println("b1 == b2 : " + (b1 == b2)); // false
        // Mission
        // `b1`의 num과 `b2`의 값이 같을 경우 true, 다를 경우 false를 반환한다.
        System.out.println("b1.equals(b2) : " + (b1.equals(b2)));
        System.out.println("b1.equals(null) : " + (b1.equals(null)));
    }
}

class Numbox {
    private int num;

    public Numbox(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Numbox) {
            // Object는 모든 객체의 주소값을 담을 수 있지만 사용할 수 있는 기능이 몇 개 없기 때문에 다형성을 통해 다른 객체의 기능을 사용한다.
            Numbox numbox = (Numbox) object;
            return this.num == numbox.num;
//        return this.num == numbox.getNum();
        }
        return false;
    }
}