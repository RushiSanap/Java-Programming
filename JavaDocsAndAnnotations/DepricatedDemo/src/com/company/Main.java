package com.company;

class Old
{
    public void display()
    {
        System.out.println("Hello");
    }

    @Deprecated
    public void show()
    {
        System.out.println("Welcome");
    }
}
public class Main {

    public static void main(String[] args) {
        Old o = new Old();
        o.show();
    }
}
