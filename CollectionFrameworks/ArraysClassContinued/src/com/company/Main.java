package com.company;

import java.util.Arrays;
import java.util.Comparator;

class My implements Comparator<Integer>
{

    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1 > o2)
            return -1;
        if(o1 < o2)
            return 1;
        return 0;
    }
}

public class Main {

    public static void main(String[] args) {
        Integer a[] = {4,3,5,6,9,1};

        //sorting based on compare method of comparable interface
        Arrays.sort(a, new My());
        System.out.println(Arrays.toString(a));

        //sorting based on comparable class
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
