package com.company;

public class Main {

    public static void main(String[] args) {
	    String str = "q";

	    //checking any single character
	    System.out.println(str.matches("."));
        System.out.println(str.matches("[pqr]"));
        System.out.println(str.matches("[^pqr]"));

        String str1 = "a";
        System.out.println(str1.matches("[a-z]"));
        System.out.println(str1.matches("[a-z0-9]"));

        String str2 = "a2^";
        System.out.println(str2.matches("[a-z][0-9]%"));

        String str3 = "a";
        System.out.println(str3.matches("a|b"));

        String str4 = "abc";
        System.out.println(str4.matches("abc"));







    }
}
