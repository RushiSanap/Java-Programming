package com.company;
//find if the email id is on gmail
//find username and domain name from email
public class Main {

    public static void main(String[] args) {
	    String str = "sanaprusikesh20@gmail.com";
	    int l = str.indexOf("@");
	    String str1 = str.substring(0, l);
	    String str2 = str.substring(l+1, str.length());

	    System.out.println("Username = " + str1);
        System.out.println("domain name = " + str2);

        int j = str.indexOf(".");
        String str3 = str.substring(l+1, j);
		System.out.println(str3.compareTo("gmail"));

    }
}
