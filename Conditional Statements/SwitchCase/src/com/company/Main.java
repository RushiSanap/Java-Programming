package com.company;
//float values are not allowed to switch cases
//integer, character and string values are allowed
//times complexity is less as compared to if-else statement
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int num;
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter day number:");
	    num = scan.nextInt();
	    switch (num)
        {
            case 1:System.out.println("Monday");
                break;
            case 2:System.out.println("Tuesday");
                break;
            case 3:System.out.println("Wednesday");
                break;
            case 4:System.out.println("Thursday");
                break;
            case 5:System.out.println("Friday");
                break;
            case 6:System.out.println("saturday");
                break;
            case 7:System.out.println("Sunday");
                break;
            default:System.out.println("Number is invalid");
                break;

        }

    }
}
