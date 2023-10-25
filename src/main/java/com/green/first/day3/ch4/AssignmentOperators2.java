package com.green.first.day3.ch4;

public class AssignmentOperators2 {
    public static void main(String[] args) {
        int r1 = 0, n1 = 0, a1 = 0;
        r1 = ++n1; // 값을 증가시켜 값을 r1에 대입한다.(값이 먼저 증가되고 이후에 값을 대입한다)
        ++a1; // 값을 증가'만' 시킨다.
        System.out.printf("r1 = %d, n1 = %d, a1 = %d\n", r1, n1, a1);

        int r2 = 0, n2 = 0, a2 = 0;
        r2 = n2++; // 값을 먼저 읽고나서 값을 증가시킨다.(값을 먼저 읽고 이후에 값을 증가시킨다) -> 때문에 'r2'가 '0'이 되는 것이다.
        a2++;
        System.out.printf("r2 = %d, n2 = %d, a2 = %d\n", r2, n2, a2);
    }
}
