package com.company;

public class Main {

    public static void main(String[] args) {
        String arr[] = {"python" , "java", "ada", "cpp", "css", "pascal", "smalltalk", "basic"};
        java.util.Arrays.sort(arr);
        for(String x:arr)
            System.out.println(x);
    }
}
