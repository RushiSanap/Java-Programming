package com.company;

public class Main {
    static <E extends Number> void show(E... list)
    {
        for(E x : list)
            System.out.println(x);
    }

    public static void main(String[] args) {
        show(10,20,30,40);
    }
}
