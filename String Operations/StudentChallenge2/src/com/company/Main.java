package com.company;

public class Main {

    public static void main(String[] args) {
        //check whether the given number is binary or not
	    long x = 101010101010L;
	    String str = x + "";//instead of that we can use String str = String.valueOf(x)
	    System.out.println(str.matches("(0|1)*"));

	    //number is hexadecimal or not
        String str1 = "12A234FE";
        System.out.println(str1.matches("([A-F0-9]+)"));

        //check the data in date format dd/mm/yyyy
        String str2 = "20/05/2000";
        System.out.println(str2.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
        System.out.println(str2.matches("\\d{2}/\\d{2}/\\d{4}"));
    }
}
