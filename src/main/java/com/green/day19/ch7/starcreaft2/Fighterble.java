package com.green.day19.ch7.starcreaft2;

// 인터페이스는 `다중 상속`이 가능하다.
public interface Fighterble extends Movable, Attackable {

}

interface Movable {
    void move(int x, int y);
}

interface Attackable {
    void attack(Unit unit);
}

class Unit {
    private int currentHP;
    private int x;
    private int y;
}

// 추상 메소드를 오버라이딩하지 않았기 때문에 컴파일 에러가 발생한다.
//class Fighter extends Unit implements Fighterble { }

class Fighter extends Unit implements Fighterble {
    @Override
    public void move(int x, int y) {

    }

    @Override
    public void attack(Unit unit) {

    }
}

class FighterTest {
    public static void main(String[] args) {
        Movable movable = new Fighter();
        movable.move(10, 20);
        Fighter fighter = (Fighter) movable;
    }
}