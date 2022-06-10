package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	    String str = "Java Programming";

	    //gives the length of the string
		//return type is a integer
	    int l = str.length();
	    System.out.println(str.length());

        //convert the entire string into lowercase
	    String str1 = str.toLowerCase();
	    System.out.println(str1);

		//convert the entire string into uppercase
        String str2 = str.toUpperCase();
        System.out.println(str2);

        //will give the substring from particular index to end of main string
        String str3 = str.substring(9);
		System.out.println(str3);

		//will give the substring from mentioned start index to end-1 index
		String str4 = str.substring(9,13);
		System.out.println(str4);

		//first character is replaced by second character from the whole string
		String str5 = str.replace('m', 't');
		System.out.println(str5);

		//remove all the starting and ending spaces of the string
		String strs = new String("      Java Programming        ");
		strs = strs.trim();
		System.out.println(strs);

		String st  = new String("Mr. Rushikesh Vinod Sanap");
		//return the character at the specified index
		System.out.println(st.charAt(5));

		//return true or false
		//check the beginning string
		System.out.println(st.startsWith("Mr."));
		System.out.println(st.startsWith("Rushi", 4));
		//check the ending string
		System.out.println(st.endsWith("sanap"));

		//return the index of the character
		//if the same character is present several times then it will return the index of the character which is coming first
		//if the character is not found -1 will be returned
		System.out.println(st.indexOf("."));
		//we can specify the starting point also
		System.out.println(st.indexOf("s", 7 ));

		System.out.println(st.lastIndexOf("a"));





    }
}
