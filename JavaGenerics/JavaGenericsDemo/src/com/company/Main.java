package com.company;

public class Main<T> {

    T data[] = (T[])new Object[3];

    public static void main(String[] args) {
        Main<String> main= new Main();
        main.data[0] = "Hi";
        main.data[1] = "Hello";
        main.data[2] = "Rushi";
    }
}
