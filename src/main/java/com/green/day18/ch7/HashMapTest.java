package com.green.day18.ch7;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        // key, value
        Map map = new HashMap();
        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);

        Object obj = map.get("c");
        int val = (int) obj;
        System.out.println(val);
    }
}

class HashMapTest2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("TV", 0);
        map.put("Computer", 0);
        map.put("Audio", 0);

        map.put("TV", map.get("TV") + 1); // map.get("TV") + 1 = 0 + 1 = 1
        map.put("TV", map.get("TV") + 1);
        map.put("TV", map.get("TV") + 1);

        System.out.println(map.get("TV"));
    }
}
