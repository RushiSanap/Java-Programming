package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int length, breadth, height,totalArea, volume;

	    Scanner s = new Scanner(System.in);

	    System.out.println("Enter the length of the cuboid: ");
	    length = s.nextInt();
        System.out.println("Enter the breadth of the cuboid: ");
	    breadth = s.nextInt();
        System.out.println("Enter the height of the cuboid: ");
	    height = s.nextInt();

	    totalArea = 2*(length*breadth + breadth*height + height*length);
	    volume = length*breadth*height;

	    System.out.println("Total surface area of Cuboid is " + totalArea + " square unit");
	    System.out.println("Total volume of the cuboid is " + volume + " cubic unit");

    }
}
