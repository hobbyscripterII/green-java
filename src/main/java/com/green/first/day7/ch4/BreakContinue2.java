package com.green.first.day7.ch4;

public class BreakContinue2 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            for(int z = 10; z < 15; z++) {
                if(z == 13) {
                    continue; // 13은 제외하고 출력된다.
                }
                System.out.printf("i = {%d}, z = {%d}\n", i, z);
            }
        }

//        for(int i = 0; i < 5; i++) {
//            for(int z = 10; z < 15; z++) {
//                if(z == 13) {
//                    break;
//                }
//                System.out.printf("i = {%d}, z = {%d}\n", i, z);
//            }
//        }
    }
}
