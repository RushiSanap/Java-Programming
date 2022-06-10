package com.company;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>(List.of("Rushi", "Ritesh", "Vikas", "John"));

        System.out.println(ts);
        System.out.println(ts.contains("Rushi"));

        Iterator<String> it = ts.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }


    }
}
