package com.company;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        int a[] = {0,2,3,4,5,6,7,8};
        int b[] = {1,2,3,4,4,6,7,8};

        //compare two arrays element by element
        System.out.println(Arrays.compare(a,b));

        //copy elements of one array into another
        int c[] = Arrays.copyOf(b,4);

        for(int x:c)
            System.out.println(x);

        int d[] = new int[10];

        //fill the array with same element
        Arrays.fill(d,10);
        for(int y:d)
            System.out.print(y + " ");

        System.out.println("");
        System.out.println(Arrays.toString(a));

       int arr[] = {2,5,1,7,3,9,8};
       //sort the array
       Arrays.sort(arr);
       System.out.println(Arrays.toString(arr));

       //return the index of the element
       System.out.println(Arrays.binarySearch(arr,9));
    }
}
