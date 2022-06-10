package com.company;

public class Main {

    public static void main(String[] args) {
	    String str = "abc!@@#$Z%";
	    String str1 = str.replaceAll("[^0-9A-Za-z]", "");
	    System.out.println(str1);

	    String str2 = "   rusj foghf    dfgjk ffff        fgg";
	    String str3 = str2.trim();
	    String str4 = str3.replaceAll("\\s+", " ");
		System.out.println(str4);

		String words[] = str4.split("\\s+");
		System.out.println(words.length);
    }
}
