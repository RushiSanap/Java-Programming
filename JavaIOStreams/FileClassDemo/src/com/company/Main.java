package com.company;

import java.io.File;
import java.io.FileOutputStream;

public class Main {

    public static void main(String[] args) throws Exception{
        File f = new File("C:\\Users\\sanap\\Desktop\\Documents");
        System.out.println(f.isHidden());
    }
}
