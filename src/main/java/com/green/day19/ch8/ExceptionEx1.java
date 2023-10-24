package com.green.day19.ch8;

public class ExceptionEx1 {
    public static void main(String[] args) {
        int num = 0;
        num = num / 0;
        try {
            // * try에서 예외가 발생할 경우 catch에서 잡는다.
            num = 10;
//            num = num / 0;
        } catch (Exception e) {
            // 예외가 발생했을 때 실행된다.
            e.printStackTrace();
            System.out.println("예외가 발생했습니다.");
            num = -1;
        } finally {
            // `무조건` 실행된다.
            System.out.println("finally를 실행합니다.");
        }
        System.out.printf("num = {%d}\n", num);
    }
}

class ExceptionEx1_2 {
    public static void main(String[] args) {
        div(10);
    }

    public static void div(int num) {
        try {
            num = 10;
            return;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("예외가 발생했습니다.");
            num = -1;
        } finally {
            // `return`을 만나면 `finally` 내의 코드까지 다 읽고(실행하고) return한다.(`catch`는 건너뛴다)
            System.out.println("finally를 실행합니다.");
        }
        System.out.printf("num = {%d}\n", num);
    }
}

class ExceptionEx1_3 {
    public void sum() {

    }

    public static void main(String[] args) {
        try {
//            int num = 10 / 0; // ArithmeticException

//            ExceptionEx1_3 exceptionEx13 = null;
//            exceptionEx13.sum(); // NPE

            int[] arr = new int[10];
            arr[10] = 10; // Exception

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { // `or`문 처럼 사용 가능하다.
            System.out.println("수학적 예외가 발생했습니다.");
        } catch (NullPointerException e) {
            System.out.println("NPE 예외가 발생했습니다.");
        } catch (Exception e) {
            System.out.println("예외가 발생했습니다.");
        }

        System.out.println("끝!");
    }
}