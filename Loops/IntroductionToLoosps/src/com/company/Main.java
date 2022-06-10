package com.company;

public class Main {

    public static void main(String[] args) {
	    int i=1;
	    //while loop
	    while(i < 100)
        {
            System.out.print(i + " ");
            i = i*2;
        }

        System.out.print("\n");

	    //do while loop
	    i = 1;
	    do {
	        System.out.print(i + " ");
	        i = i*2;
        }while(i<100);

        System.out.print("\n");
	    //for loop
        for(i = 1; i < 100; i=2*i){
            System.out.print(i + " ");
        }
    }
}
