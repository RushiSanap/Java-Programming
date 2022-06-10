package com.company;

import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);
        dq.offerLast(50);

        System.out.println(dq);

        dq.pollLast();
        dq.pollLast();
        dq.pollLast();
        System.out.println(dq);

        /*dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerFirst(3);
        dq.offerFirst(4);
        dq.offerFirst(5);*/



    }
}
