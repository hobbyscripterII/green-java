package com.green.extra.day1;

public class Main {
    public static void main(String[] args) {
        System.out.println("args.length = " + args.length);
//        System.out.println("Arrays.toString(args) = " + Arrays.toString(args));

//        for (int i = 0; i < args.length; i++) {
//            System.out.println(args[i]);
//        }

        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
