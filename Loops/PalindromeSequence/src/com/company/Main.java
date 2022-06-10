package com.company;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String  str;
	    Scanner scan = new Scanner(System.in);
        str = scan.nextLine();
        int count = 0;
        for(int i = 0, j = str.length() - 1; i < str.length() && j >= 0; i++, j--)
        {
            if(str.charAt(i) == str.charAt(j))//if(Character.compare(str.charAt(i), str.charAt(j)) == 0)
            {
                count++;
            }
        }
        if(count == str.length())
            System.out.println("Palindrome Sequence");
        else
            System.out.println("Not a Palindrome Sequence");

    }
}
