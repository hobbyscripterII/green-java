package com.green.day17.ch7;

class Product2 {
    private String name;
    private int price;
    private int bonusPoint;

    public Product2(String name, int price) {
        this.name = name;
        this.price = price;
        this.bonusPoint = (int) (price * 0.1);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    @Override
    public String toString() {
        return String.format("name: %s, price: %d, bonusPoint: %d", name, price, bonusPoint);
    }
}

class Tv2 extends Product2 {
    public Tv2() {
        super("2023 QLED 4K", 259);
    }
}

class Computer2 extends Product2 {
    public Computer2() {
        super("맥북", 200);
    }
}

class Audio2 extends Product2 {
    public Audio2() {
        super("마샬", 550);
    }
}

class Buyer2 {
    Product2[] product;
    private int money;
    private int bonusPoint;
    private int i;

    public Buyer2() {
        this.money = 5_000;
        product = new Product2[10];
    }

    public void buy(Product2 product2) {
        String msg = i == product.length ? "[알림] 더 이상 구매할 수 없습니다.\n" : (money < product2.getPrice() ? "[알림] 금액이 부족합니다.\n" : String.format("product: %s, money: %d bonusPoint: %d\n", product2.getName(), money, bonusPoint));

        if (i == product.length || money < product2.getPrice()) return;

        money -= product2.getPrice();
        bonusPoint += product2.getBonusPoint();
        product[i++] = product2;

        System.out.printf(msg);
    }
}

class PolyArgumentTestVer3 {
    public static void main(String[] args) {
        Buyer2 buyer2 = new Buyer2();
        buyer2.buy(new Tv2());
        buyer2.buy(new Computer2());
        buyer2.buy(new Computer2());
        buyer2.buy(new Computer2());
        buyer2.buy(new Audio2());
        buyer2.buy(new Audio2());
        buyer2.buy(new Audio2());
        buyer2.buy(new Tv2());
        buyer2.buy(new Tv2());
        buyer2.buy(new Tv2());
        buyer2.buy(new Tv2());
        buyer2.buy(new Tv2());
    }
}

class PolyArgumentTestVer2_2 {
    public static void main(String[] args) {
        Tv2 tv2 = new Tv2();
        System.out.println(tv2);

        Computer2 computer2 = new Computer2();
        System.out.println(computer2);

        Audio2 audio2 = new Audio2();
        System.out.println(audio2);
    }
}

public class PolyArgumentTestVer2 {
    public static void main(String[] args) {
//        Product2 product2 = new Product2("TV", 100);
//        System.out.println(product2);
    }
}
