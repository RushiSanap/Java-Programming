package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String str;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the URL link:");
        str = scan.nextLine();
        String websiteType = str.substring(str.lastIndexOf(".") + 1);

        switch (websiteType)
        {
            case "com":System.out.println("Commercial website");
                break;

            case "org":System.out.println("Organisation website");
                break;

            case "net":System.out.println("Network website");
                break;

            case "gov":System.out.println("Government website");
                break;

        }


    }
}
