package com.company;

public class Main {

    public static void main(String[] args) {
        String str = "C sharp";
        String str1 = "java";
        String str2 = "JAVA";
        String str3 = "Python";
        String str4 = "Python";
        String str5 = new String("Python");

        //compare the contents of two strings and return the boolean value
        System.out.println(str1.equals(str2));
        System.out.println(str3.equals(str4));

        //checking the string by ignoring the cases of the of the characters
        System.out.println(str1.equalsIgnoreCase(str2));

        //comparing the strings character by character according to their ascii value
        //return 0, +ve or -ve integers
        //if two strings are exactly equal then 0 will be returned
        //for different strings difference between the ascii value of two characters will be returned
        System.out.println(str1.compareTo(str2));
        System.out.println(str3.compareTo(str4));
        System.out.println(str2.compareTo(str3));

        //only checking the content of the string
        System.out.println(str4.compareTo(str5));

        //check whether two references referring the same object or not
        //str4 in created in pool but str5 is created in heap that's why they are referencing to different objects
        System.out.println(str4 == str5);

        //both the objects are created in pool hence they are pointing to same object
        System.out.println(str4 == str3);

        //str1 == str2 check whether both are referring tp same object or not
        //str1.equals(str2) will check the content of the str1 and str2

        //check the content
        System.out.println(str.contains("shar"));

        //concatenation
        String str_1 = "THe great wall";
        String str_2 = " of chana";
        System.out.println(str_1 + str_2);
        System.out.println(str_1.concat(str_2));





    }
}
