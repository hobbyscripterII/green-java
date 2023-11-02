package com.green.second.ch6;

class NumBox {
    int num;
}

class DiffPriRef2 {
    public static void changeVal(int num) {
        System.out.println(num);
        num = 10;
        System.out.println(num);
    }

    public static void changeVal(NumBox numBox) {
        System.out.println(numBox.num);
        numBox.num = 10;
        System.out.println(numBox.num);
    }

    public static void main(String[] args) {
        int num = 1;
        DiffPriRef2.changeVal(num);
    }
}

public class DiffPriRef {
    public void changeVal(int num) {
        num = 10;
    }

    public void changeVal(NumBox numBox) {
//        System.out.println(numBox.num);
//        numBox.num = 10;
//        System.out.println(numBox.num);

        // 메인 메소드에서 넘어온 NumBox 객체의 주소값이 담겨져 있는 참조변수에다가
        // 새로운 NumBox 객체의 주소값을 생성했기 때문에(다른 주소값을 참조하고 있기 때문에) 메인 메소드의 값은 변경되지 않는다.
        numBox = new NumBox();
        numBox.num = 20;
        // 이후 해당 메소드가 종료되면 객체의 주소값 또한 메모리에서 제거된다.
    }

    public static void main(String[] args) {
        int num = 1;
        DiffPriRef diffPriRef = new DiffPriRef();
        diffPriRef.changeVal(num);
//        System.out.println(num);

        NumBox numBox = new NumBox(); // `new` 연산자 뒤에 오는 것은 무조건 `생성자`이다.
        numBox.num = 1;
        diffPriRef.changeVal(numBox);
        System.out.println(numBox.num);
    }
}
