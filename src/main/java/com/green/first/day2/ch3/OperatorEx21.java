package com.green.first.day2.ch3;

public class OperatorEx21 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 10;
        int n3 = 11;
        int n4 = 9;

        System.out.printf("%d < %d : %b\n", n1, n2, n1 < n2);
        System.out.printf("%d < %d : %b\n", n1, n3, n1 < n3);
        System.out.printf("%d < %d : %b\n", n1, n4, n1 < n4);
        System.out.printf("%d <= %d : %b\n", n1, n2, n1 <= n2);
        System.out.println(" ");
        System.out.printf("%d > %d : %b\n", n1, n2, n1 > n2);
        System.out.printf("%d > %d : %b\n", n1, n3, n1 > n3);
        System.out.printf("%d > %d : %b\n", n1, n4, n1 > n4);
        System.out.printf("%d >= %d : %b\n", n1, n4, n1 >= n4); // 크거나 같으면 true
        System.out.println(" ");
        System.out.printf("%d == %d : %b\n", n1, n2, n1 == n2);
        System.out.printf("%d != %d : %b\n", n1, n2, n1 != n2);
        System.out.printf("%d != %d : %b\n", n1, n3, n1 != n3);

    }
}
