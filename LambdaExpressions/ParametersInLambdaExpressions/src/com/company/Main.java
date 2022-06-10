package com.company;

@FunctionalInterface
interface MyLambda
{
    public int add(int a, int b);
}

public class Main {

    public static void main(String[] args) {
        /*MyLambda m = (a,b)->{return a+b;};
        int r = m.add(20,30);
        System.out.println(r);*/

        MyLambda m = (a,b)->a+b;
        int r = m.add(20,30);
        System.out.println(r);


    }
}
