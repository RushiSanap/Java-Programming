package com.company;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try
        {
            File f = new File("C:\\Users\\sanap");

            //check it is directory or not
            System.out.println(f.isDirectory());

            /*return the array of string of the name of the files and folder in that directory
            String list[] = f.list();
            for(String x:list)
                System.out.println(x);*/

            File listFiles[] = f.listFiles();
            for(File t : listFiles)
                System.out.println(t.getName() + "    " + t.getPath());


        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
