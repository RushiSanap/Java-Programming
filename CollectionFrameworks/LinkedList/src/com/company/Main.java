package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList<>();

        LinkedList<Integer> ll2 = new LinkedList<Integer>(List.of(20,30,40));

        System.out.println(ll2.peek());
        ll2.push(10);
        System.out.println(ll2);


    }
}
