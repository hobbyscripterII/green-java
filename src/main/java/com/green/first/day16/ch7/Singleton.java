package com.green.first.day16.ch7;

public class Singleton {
    // 객체 생성을 막는다.
    private Singleton() {
    }

    // 객체 생성없이 호출할 수 있어야 하므로 'static'으로 선언한다.
    static private Singleton singleton;

    // 최초 1번 객체 생성 이후, null이 아니기 때문에 한 주소값만 'return'한다.
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}

class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("singleton1 == singleton2 = " + (singleton1 == singleton2));
    }
}
