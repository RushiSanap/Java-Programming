package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    static void show(int n)
    {
        if(n>0)
            System.out.println(n);
    }

    public static void main(String[] args) {
        ArrayList<Integer> Al1= new ArrayList<>(10);

        ArrayList<Integer> Al2= new ArrayList<Integer>(List.of(50,60,70,80));

        Al1.add(10);
        Al1.add(20);
        Al1.add(2,14);


        Al1.addAll(Al2);
        Al1.set(4,12);//replace the value by 12 at index 4

        System.out.println(Al1);

        //for(int i = 0; i < Al1.size(); i++)
           // System.out.println(Al1.get(i));//get will return the element at index i

        //iterator always only forward direction access
        Iterator<Integer> it = Al1.iterator();
        /*while (it.hasNext())
        {
            System.out.println(it.next());
        }*/

        //list iterator allows bidirectional access
        ListIterator<Integer> itl = Al1.listIterator();

        //lambda expression
        Al1.forEach((n)->System.out.println(n));



    }
}
