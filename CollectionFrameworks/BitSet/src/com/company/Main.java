package com.company;

import java.util.BitSet;

public class Main {

    public static void main(String[] args) {
        BitSet bs1= new BitSet();

        bs1.set(0);
        bs1.set(2);
        bs1.set(4);
        bs1.set(6);
        bs1.set(7);
        System.out.println(bs1);

        BitSet bs2 = new BitSet();

        bs2.set(0,8);
        bs2.clear(2);
        System.out.println(bs2);

        bs2.and(bs1);

        System.out.println(bs2);

        bs1.flip(0,bs1.length());

        System.out.println(bs1);

    }
}
