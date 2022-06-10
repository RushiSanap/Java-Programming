package com.company;

import java.awt.image.ShortLookupTable;

class Test
{
    final int MAX = 1;
    //direct initialisation is possible

    final int MIN;

    //can be initialised with the help of constructors
    Test() {
        MIN = 10;
    }

    //can be initialised using a block
    final int SAM;
    {
        SAM = 10;
    }

    //If variable is both static and final then it can be initialised in static block
    static final int RUS;
    static
    {
        RUS = 14;
    }

}

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
