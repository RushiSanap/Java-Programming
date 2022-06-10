package com.company;

import java.util.Locale;

@FunctionalInterface
interface MyLambda
{
    public void display(String str);
}

interface MyLambda2
{
    public int comapre(String str1, String str2);
}

public class Main {

    public void reverse(String str)
    {
        StringBuffer string = new StringBuffer(str);
        string.reverse();
        System.out.println(string);
    }

    public Main(String s)
    {
        System.out.println(s.toUpperCase());
    }

    public static void main(String[] args) {
        MyLambda ml = System.out::println;
        ml.display("Hello");

        /*for static methods
        MyLambda m = Main::reverse;
        m.display("Hello");*/

        //for non-static methods

        MyLambda mld = Main::new;
        mld.display("hello");

        MyLambda2 ml2 = String::compareTo;
        System.out.println(ml2.comapre("hello", "hello"));

    }
}
