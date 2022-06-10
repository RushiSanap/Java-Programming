package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String str;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the URL link:");
		str = scan.nextLine();
;	    String protocol = str.substring(0,str.indexOf(":"));
	    String websiteType = str.substring(str.lastIndexOf(".") + 1);

	    //System.out.println(protocol);
		//System.out.println(websiteType);
		if(protocol.equalsIgnoreCase("https"))
		{
			System.out.println("hypertext transfer protocol secure");
		}
		else if(protocol.equalsIgnoreCase("http"))
		{
			System.out.println("hypertext transfer protocol");
		}
		else if(protocol.equalsIgnoreCase("ftp"))
		{
			System.out.println("file transfer protocol");
		}
		else if(protocol.equalsIgnoreCase("smtp"))
		{
			System.out.println("simple mail transport protocol");
		}
		else if(protocol.equalsIgnoreCase("udp"))
		{
			System.out.println("user datagram protocol");
		}
		else if(protocol.equalsIgnoreCase("pop"))
		{
			System.out.println("post office protocol");
		}


		if(websiteType.equalsIgnoreCase("com"))
		{
			System.out.println("Commercial website");
		}
		else if(websiteType.equalsIgnoreCase("net"))
		{
			System.out.println("Network website");
		}
		else if(websiteType.equalsIgnoreCase("org"))
		{
			System.out.println("Organisation website");
		}

    }
}
