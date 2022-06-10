package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args)
    {
        //hash set provides guarantee of add, remove and search operation of constant time
        HashSet<Integer> hs = new HashSet<Integer>(20,0.75f);

        hs.add(10);
        hs.add(20);
        hs.add(50);
        hs.add(10);

        System.out.println(hs);
    }
}
