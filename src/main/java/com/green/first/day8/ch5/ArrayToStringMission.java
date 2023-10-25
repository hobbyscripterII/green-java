package com.green.first.day8.ch5;

public class ArrayToStringMission {
    public static void main(String[] args) {
        // [5, 10, 7, 3] 출력하기(Arrays.toString 사용 금지, 끝에 ',' 콤마 출력 금지)
        int[] arr = {5, 10, 7, 3};

//        System.out.print("[");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//            if(arr[i] != arr.length - 1) {
//                System.out.print(", ");
//            }
//        }
//        System.out.print("]");

        // 풀이 1
        int arrLength = arr.length - 1;

//        System.out.println("[1] >>>>>");
//        System.out.print("[");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//
//            if (i < arrLength) {
//                System.out.print(", ");
//            }
//        }
//        System.out.print("]");

        // 풀이 2
//        System.out.println("[2] >>>>>");
//        System.out.print("[");
//        for (int i = 0; i < arr.length; i++) {
//            if (i > 0) {
////            if (i != 0) {
//                System.out.print(", ");
//            }
//            System.out.print(arr[i]);
//        }
//        System.out.print("]");

        // 풀이 3
        System.out.println("[3] >>>>>");
        System.out.printf("[%d", arr[0]);
        for(int i = 1; i < arr.length; i++) {
            System.out.printf(", %d", arr[i]);
        }
        System.out.print("]");
    }
}