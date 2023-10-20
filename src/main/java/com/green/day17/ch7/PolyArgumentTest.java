package com.green.day17.ch7;

class Product {
    private String product;
    private int price;
    private int bonusPoint;

    public Product(int price) {
        this.price = price;
//        this.bonusPoint = price / 10;
        this.bonusPoint = (int) (price * 0.1);
    }

    public int getPrice() {
        return price;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return String.format("%s, price %d원, bonusPoint %dPoint", product, price, bonusPoint);
    }
}

class Tv extends Product {
    public Tv() {
        super(100);
        setProduct("TV");
    }

    @Override
    public String toString() {
        return "TV";
    }
}

class Computer extends Product {
    public Computer() {
        super(200);
        setProduct("Computer");
    }

    @Override
    public String toString() {
        return "Computer";
    }
}

public class PolyArgumentTest {
    public static void main(String[] args) {
        // 문제 1
//        Product product = new Product();
//        Product product1 = new Product(100); // price + 100, bonusPoint = price의 10%
//        System.out.println(product1);
//
//        Product product2 = new Product(200); // price + 200, bonusPoint = price의 10%
//        System.out.println(product2);

        // 문제 2
//        Tv tv = new Tv();
        Computer computer = new Computer();
        int computerPrice = computer.getPrice();
        int computerBonusPoint = computer.getBonusPoint();
        System.out.println(computerPrice + " " + computerBonusPoint);

        Tv tv = new Tv();
        int tvPrice = tv.getPrice();
        int tvBonusPoint = tv.getBonusPoint();
        System.out.println(tvPrice + " " + tvBonusPoint);
    }
}

class Buyer {
    private int money;
    private int bonusPoint;

    public Buyer() {
        money = 1050;
        bonusPoint = 0;
    }

    // Tv와 Computer가 Product를 상속 받았으므로 Product를 사용함으로써 메소드를 하나로 통일할 수 있다.
    public void buy(Product product) {
//        System.out.printf("product = {%s} price = {%d} bonusPoint = {%d}\n", product, money, bonusPoint);
        if (money < product.getPrice()) {
            System.out.println("잔액이 부족합니다.");
        } else {
            money -= product.getPrice();
            bonusPoint += product.getBonusPoint();
            System.out.printf("%s를 구입하셨습니다. 남은 잔액: %d 현재 포인트: %d\n", product, money, bonusPoint);
        }
    }

//    public void buy(Tv tv) {
//        System.out.println(tv.getPrice());
//    }
//
//    public void buy(Computer computer) {
//        System.out.println(computer.getPrice());
//    }

    @Override
    public String toString() {
        return String.format("price %d원, bonusPoint %dPoint", money, bonusPoint);
    }
}

class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
//        buyer.buy(new Tv());
//        buyer.buy(new Computer());

        // 잔액이 부족할 경우 '잔액 부족' 출력 및 money 미반영
        // 잔액이 부족하지 않을 경우에는 '(물건)을 구입하셨습니다.'를 출력하고 money를 반영한다.
        buyer.buy(new Tv());
        buyer.buy(new Tv());
        buyer.buy(new Tv());
        buyer.buy(new Tv());
        buyer.buy(new Tv());
        buyer.buy(new Tv());
        buyer.buy(new Computer());
        buyer.buy(new Computer());
        buyer.buy(new Computer());
        buyer.buy(new Computer());
        buyer.buy(new Computer());
        buyer.buy(new Computer());
        buyer.buy(new Computer());
        buyer.buy(new Computer());
        buyer.buy(new Computer());
    }
}