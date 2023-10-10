package com.green.day9.ch5;

public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = {"kim", "park", "lee"};

        names[1] = "woo";

//        for(int i = 0; i < names.length; i++) {
//            System.out.printf("names = {%s}\n", names[i]);
//        }

        for (String str : names) {
            System.out.println(str);
        }

        int i = 0;
        for (String str : names) {
            System.out.printf("names = {%s}, i = {%d}\n", str, i++);
        }
    }
}
