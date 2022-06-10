package com.company;

import java.util.Scanner;
//person is young or not
//14-55 is the range for the young age
public class Main {

    public static void main(String[] args) {
        int age;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the age of a person:");
        age = s.nextInt();
        if(age >= 14 && age <=55)
        {
            System.out.println("Person is young");
        }
        else
        {
            System.out.println("Person is not young");
        }
    }
}
