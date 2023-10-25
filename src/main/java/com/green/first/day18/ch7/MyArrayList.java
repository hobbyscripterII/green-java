package com.green.first.day18.ch7;

public class MyArrayList {
    private int[] arr;

    public MyArrayList() {
        arr = new int[0];
    }

    void add(int val) {
        int[] temp = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        temp[arr.length] = val;
        arr = temp;
    }

    void add(int idx, int val) {
        int[] temp = new int[arr.length + 1];
        temp[idx] = val;

        System.out.println(arr[idx]);
        // 방법 1
        for (int i = 0; i < arr.length; i++) {
            temp[i < idx ? i : i + 1] = arr[i];
        }
        arr = temp;

        // 방법 2
//        for (int i = 0; i < idx; i++) {
//            temp[i] = arr[i];
//        }
//        for (int i = idx; i < arr.length; i++) {
//            temp[i + 1] = arr[i];
//        }
//        arr = temp;
    }

    @Override
    public String toString() {
        if (arr.length == 0) return "[]";

        String str = String.format("[%d", arr[0]);
        for (int i = 1; i < arr.length; i++) {
            str += String.format(", %d", arr[i]);
        }
        return str + "]";
    }

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
//        list.add(1, 40);
//        System.out.println(list);
    }
}
