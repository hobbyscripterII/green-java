package com.green.day19.ch7.starcraft;

import java.util.ArrayList;
import java.util.List;

// 추상 메소드가 있으면 추상 메소드가 되어야한다.
public abstract class Unit {
    protected int x; // 다른 패키지라도 상속은 접근 가능하다.
    protected int y;

    public abstract void move(int x, int y);

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // 추상 메소드가 아닌 메소드도 가질 수 있다.
    public void stop() {
        System.out.println("현재 위치에서 정지합니다.");
    }
}

// 상속받은 클래스에 추상 메소드가 있으면 오버라이딩을 해야하는 `강제성` 때문에 에러가 발생한다. => `@Override`를 통해 추상 메소드를 구현한다.
class Marine extends Unit {
    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.printf("Marine이 x = %d, y = %d로 이동합니다.\n", x, y);
    }

    public void steamPack() {
        System.out.println("스팀팩을 사용합니다.");
    }
}

class Tank extends Unit {
    private boolean siegeMode;

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.printf("Tank가 x = %d, y = %d로 이동합니다.\n", x, y);
    }

    public void changeMode() {
        siegeMode = !siegeMode;
        System.out.printf(siegeMode == true ? "시즈 모드가 되었습니다.\n" : "시즈 모드가 풀렸습니다.\n");
    }
}

class StarcraftGame2 {
    static public void moveAll(List<Unit> list, int x, int y) {
        for (Unit unit : list) {
            unit.move(x, y);
        }

//        for (int i = 0; i < unit.size(); i++) {
//            unit.get(i).move(x, y); // GOOD CODE
//        }
    }

    public static void main(String[] args) {
        List<Unit> units = new ArrayList();
        units.add(new Marine());
        units.add(new Marine());
        units.add(new Marine());
        units.add(new Tank());
        units.add(new Tank());
        moveAll(units, 30, 50);

        // 마지막 인덱스에 있는 탱크 주소값
        Unit unit = units.get(units.size() - 1);
        Tank tank = (Tank) unit; // 다형성, changeMode를 호출하기위해 Tank로 형변환한다.
        tank.changeMode();
        tank.changeMode();

    }
}

class StarcraftGame {
    public static void main(String[] args) {
        Unit unit = new Marine();
        unit.move(10, 20);
        Unit unit2 = new Tank();
        unit2.move(10, 20);

        List<Unit> units = new ArrayList();
        units.add(unit);
        units.add(unit2);
    }
}

class Test {
    public static void main(String[] args) {
        Tank tank = new Tank();
        tank.changeMode();
        tank.changeMode();
        tank.changeMode();
    }
}