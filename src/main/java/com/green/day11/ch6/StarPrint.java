package com.green.day11.ch6;

public class StarPrint {
    void line(int val) {
        for (int i = 0; i < val; i++) {
            System.out.printf("*");
        }
        System.out.println();
    }

    void square(int val) {
        for (int i = 0; i < val; i++) {
            line(val);
        }
        System.out.println();
    }

    void triangle(int val) {
        // int i를 '0'으로 설정시, line()의 i가 0보다 작지않기 때문에 반복문을 벗어나 개행만 실행된다.
        for (int i = 1; i <= val; i++) {
            line(i);
        }
    }

//    String chkGenderById(String jumin) {
//        String gender = jumin.substring(7, 8);
//        switch (gender) {
//            case "2", "4":
//                return "여성";
//            case "1", "3":
//                return "남성";
//        }
//        return "유효하지않은 주민번호입니다.";
//    }

    String chkGenderById(String jumin) {
        char gender = jumin.charAt(7);
        switch (gender) {
            case '2', '4':
                return "여성";
            case '1', '3':
                return "남성";
        }
        return "유효하지않은 주민번호입니다.";
    }

    int sumFromTo(int val1, int val2) {
        int sum = 0;
        for (int i = val1; i <= val2; i++) {
//            System.out.println(sum);
            sum += i;
        }
        return sum;
    }


}
