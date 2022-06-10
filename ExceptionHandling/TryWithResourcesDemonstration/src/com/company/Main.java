package com.company;
import java.io.*;
import java.util.Scanner;

public class Main {
    static Scanner scan;
    static FileInputStream fi;

    static void divide() throws Exception
    {
        fi = new FileInputStream("C:\\Users\\sanap\\Desktop\\Vacation Learning\\ExceptionHandling\\Test.txt");
        Scanner scan = new Scanner(fi);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println(a/b);
        fi.close();
    }

    public static void main(String[] args) throws Exception
    {

    }
}
