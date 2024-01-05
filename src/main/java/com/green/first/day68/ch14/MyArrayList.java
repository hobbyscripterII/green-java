package com.green.first.day68.ch14;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MyArrayList {
    private int[] arr;

    public MyArrayList() {
        arr = new int[0];
    }

    public int[] add(int num) {
        int[] temp = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        temp[arr.length] = num;
        arr = temp;
        return arr;
    }

    public void forEach(Consumer<Integer> con) {
        for (int i = 0; i < arr.length; i++) {
            con.accept(arr[i]);
        }
    }

    public void removeIf(Predicate<Integer> pre) {
        MyArrayList tempList = new MyArrayList();
        for(int i = 0; i < arr.length; i++) {
            if(!pre.test(arr[i])) {
                tempList.add(arr[i]);
            }
        }
        arr = tempList.arr;
    }
}

class MyArrayListTest {
    public static void main(String[] args) {
//        MyArrayList list = new MyArrayList();
//        list.add(10);
//        list.add(13);
//        list.add(16);
//        list.add(19);
//        list.add(22);
//        list.forEach(i -> System.out.printf("i = {%d}", i));
//        list.removeIf(v -> v % 2 == 0);
//        list.forEach(i -> System.out.printf("i = {%d}", i));
//        list.replaceAll(v -> v <= 15 ? v * 2 : v);

        Map<String, String> map = new HashMap<>();
        map.put("name", "홍길동");
        map.put("age", "20");
        map.put("height", "175");
        map.forEach((k, v) -> System.out.printf("%s: %s\n", k, v));
    }
}