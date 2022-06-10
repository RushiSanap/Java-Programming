package com.company;

class Parent
{
    public void display() {
        System.out.println("Hello");
    }
}

class Child extends Parent
{
    @Override
    public void display() {
        System.out.println("Hi");
    }
}

public class Main {

    public static void main(String[] args) {

    }
}
