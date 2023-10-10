package com.green.day9.ch5;

import java.util.Scanner;

public class ArrayEx16 {
    public static void main(String[] args) {
        String[] arr = new String[3];
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++) {
            System.out.printf("%d번째 문자를 입력하세요.", i + 1);
            arr[i] = s.nextLine();
        }

        for (String str : arr) {
            System.out.print(str);
        }
    }
}
