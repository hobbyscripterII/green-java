package com.green.first.day12.ch6;

public class MethodExam3 {
    int sumText(String str) {
        int num = Integer.parseInt(str); // 문자열을 정수로 변환한다.
        int sum = 0; // 합계를 담을 변수를 생성한다.
        int temp = 0; // 1의 자리 숫자를 담을 임시 저장용 변수를 생성한다.

        // 배열에 담긴 길이만큼 반복문을 실행한다.
        for (int i = 0; i < str.length(); i++) {
            // 1의 자리 숫자를 temp에 담기위해 num의 나머지를 구한다.
            temp = num % 10;
            // 1의 자리 숫자를 날린다.
            num /= 10;
            // 1의 자리 숫자를 sum에 더한다.
            sum += temp;
        }
        return sum;
    }

//    int sumText(String str) {
//        // str에 담긴 문자열을 char로 변환 후 char 배열에 담는다.
//        char[] arr = str.toCharArray(); // character array!
//        int sum = 0;
//        System.out.print("c = ");
//        for (char c : arr) {
//            System.out.printf("%c ", c);
//            sum += Character.getNumericValue(c); // char을 정수로 변환해 sum에 더해 담는다.
//        }
//        System.out.println();
//        return sum;
//    }

    public static void main(String[] args) {
        MethodExam3 methodExam3 = new MethodExam3();
        System.out.println(methodExam3.sumText("12345"));
    }
}
