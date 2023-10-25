package com.green.first.day16.ch7;

public class Animal {
    public void crying() {
        System.out.println("운다.");
    }
}

class Dog extends Animal {
    @Override
    public void crying() {
        System.out.println("멍멍!");
    }
}

class BullDog extends Dog {
    @Override
    public void crying() {
        System.out.println("불독이 왈왈!");
    }

    public void jump() {
        System.out.println("불독이 점프!");
    }
}

class Cat extends Animal {
    @Override
    public void crying() {
        System.out.println("야옹~");
    }
}

class AnimalTest {
    public static void main(String[] args) {
        // 1. 부모 타입은 자식 객체 주소값을 담을 수 있다.
//        Dog dog = new BullDog();
//        Animal animal = new BullDog();
//        Animal animal2 = new Dog();
//        Animal animal3 = new Cat();

        // 2. 자식 타입은 부모 객체 주소값을 담을 수 없다.
//        BullDog bullDog = new Dog(); // ERROR
        Dog dog = new Dog();
//        BullDog bullDog = (BullDog) dog; // ERROR
        Animal animal = dog;

        // 3. 타입은 알고있는 메소드만 호출할 수 있다.
        // 4. 호출이 된다면 객체 기준이다.
        BullDog bullDog = new BullDog();
        bullDog.jump();
        bullDog.crying(); // BullDog의 crying()이 실행된다. 가장 빨리만나는 객체 기준으로 실행된다.(bullDog에 없으면 dog -> Animal순으로 올라간다)
    }
}

class AnimalTest2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        BullDog bullDog = new BullDog();

        callCrying(dog);
        callCrying(cat);
        callCrying(bullDog);
    }

    private static void callCrying(Animal animal) {
        // animal: 1. Bulldog 2. Cat
        // 1. BullDog이 Bulldog으로 형변환이 가능한가?
        // 2. Cat이 Bulldog으로 형변환이 가능한가?
        if (animal instanceof BullDog) {
            BullDog bullDog = (BullDog) animal;
            bullDog.jump();
        }
    }

//    private static void callCrying(Dog dog) {
//        dog.crying();
//    }
//
//    private static void callCrying(Cat cat) {
//        cat.crying();
//    }
}

class AnimalTest3 {
    public static void main(String[] args) {
        Animal animal = new Cat();
        System.out.println(animal instanceof Dog);
        Dog dog = (Dog) animal; // 강제형변환, ERROR
        System.out.println(animal instanceof Cat);
    }
}
