package com.company;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>(5){
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                return size() > 5;
            }
        };
        lhm.put(1, "A");
        lhm.put(2, "B");
        lhm.put(3, "C");
        lhm.put(4, "D");
        lhm.put(5, "E");
        lhm.put(6, " F");
        lhm.forEach((k, v)->System.out.println(k + " " + v));
    }
}
