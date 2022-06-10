package com.company;

import com.sun.source.tree.Tree;


import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Main {

    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>(Map.of(1, "A", 2, "B", 3, "C", 4, "D"));

        System.out.println(tm);

        tm.put(6, "E");
        tm.put(5, "F");

        Entry<Integer, String> e = tm.firstEntry();
        System.out.println(e.getKey() + " " + e.getValue());

        tm.remove(1);

        System.out.println(tm);
        System.out.println(tm.ceilingEntry(2).getKey());
    }
}
