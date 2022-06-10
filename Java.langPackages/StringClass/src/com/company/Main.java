package com.company;

public class Main {

    public static void main(String[] args) {

        //immutable strings are formed
        String s1 = new String("Hello");

        //String are mutable and thread safe
        StringBuffer s2 = new StringBuffer("Hello");

        //Strings are mutable but not thread safe
        StringBuilder s3 = new StringBuilder("Hello");

        s1.concat(" World");//s1 is not modified
        s2.append(" world");//s2 gets modified
        s3.append(" world");//s3 gets modified

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
