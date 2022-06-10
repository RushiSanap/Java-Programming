package com.company;

public class Main {

    boolean validate(String name)
    {
        if(name.matches("[a-zA-Z\\s]+"))
            return true;
        else
            return false;
    }

    boolean validate(int age)
    {
        if(age > 3 && age < 15)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String name = "Rushikesh Vinod Sanap";
        int age = 13;
        Main method = new Main();
        if(method.validate(name))
            System.out.println("Valid name");
        else
            System.out.println("Invalid name");

        if(method.validate(age))
            System.out.println("Valid age");
        else
            System.out.println("Invalid age");
    }
}
