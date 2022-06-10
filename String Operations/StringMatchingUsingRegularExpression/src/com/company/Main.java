package com.company;
//* for any number of times
//+ for one or more
//? for 0 or 1
//{x} for exactly X times
//{X,Y} ranging from X times to Y times
public class Main {

    public static void main(String[] args) {
        String str = "sanaprushikesh2005@gmail.com";
        System.out.println(str.matches("\\w*@gmail.com"));
    }
}
