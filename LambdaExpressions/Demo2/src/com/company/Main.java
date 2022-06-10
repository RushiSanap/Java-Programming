package com.company;

@FunctionalInterface
interface MyLambda
{
    public void display(String s);
}

public class Main {

    public static void main(String[] args) {
        //parameters in lambda expressing
	    MyLambda m = (s)->{System.out.println(s);};
	    m.display("Hi, Rushi!!!");
    }
}
