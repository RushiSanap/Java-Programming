package com.company;

public class Main {

    public static void main(String[] args) {

	    char x[] = {'r', 'u', 's', 'h', 'i'};
	    byte y[] = {65, 66, 67, 68, 69};

	    String str1 = "Rushi";
	    String str2 = new String("Rushi");
	    String str3 = new String(x);
	    String str4 = new String(y);

	    System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);

		//2nd argument is for starting index of the of the array and 3rd argument is for required number of characters in an array
		String str5 = new String(x, 0, 3);

		//2nd argument is for starting index of the of the array and 3rd argument is for required number of characters in an array
		String str6 = new String(y, 1, 3);

		System.out.println(str5);
		System.out.println(str6);

		String str_1 = "Rushikesh";
		String str_2 = "Rushikesh";

		System.out.println(str_1 == str_2);//if both the strings are created in pool and are referring to same object then output is true otherwise false

		String str_3 = "Rushikesh";
		String str_4 = new String("Rushikesh");

		System.out.println(str_3 == str_4);
		//here strings are same but the str_3 referring to an object in a pool while str_4 is referring to an object in a heap
		//output is false
    }
}
