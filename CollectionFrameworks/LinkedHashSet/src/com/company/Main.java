package com.company;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>(10);

        lhs.add("A");
        lhs.add("B");
        lhs.add("c");
        lhs.add("D");
        lhs.add("E");

        Iterator<String> it = lhs.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
