package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Main {

    public static void main(String[] args) throws Exception{
        Properties p = new Properties();
        Properties p1 = new Properties();

        p.setProperty("Brand", "Asus");
        p.setProperty("Processor", "I7");
        p.setProperty("OS", "Windows");
        p.setProperty("Model", "Latitude");

        System.out.println(p);
        p.store(new FileOutputStream("Properties.txt"), "Laptop");

        p1.load(new FileInputStream("Java Program.txt"));
        System.out.println(p1);
        System.out.println(p1.getProperty("Nationality"));


    }
}
