package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try
        {
            FileReader fr = new FileReader("C:\\Users\\sanap\\Desktop\\Vacation Learning\\JavaIOStreams\\BufferReader\\Test.txt");
            BufferedReader br = new BufferedReader(fr);
            //readLine read the content of the file line by line
            System.out.println(br.readLine());
            System.out.println(br.readLine());

            fr.close();
            br.close();

        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
