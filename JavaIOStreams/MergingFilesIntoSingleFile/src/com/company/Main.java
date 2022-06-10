package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class Main {

    public static void main(String[] args) {
        try
        {
            FileInputStream fis1 = new FileInputStream("C:\\Users\\sanap\\Desktop\\Vacation Learning\\JavaIOStreams\\MergingFilesIntoSingleFile\\Source1.txt");
            FileInputStream fis2 = new FileInputStream("C:\\Users\\sanap\\Desktop\\Vacation Learning\\JavaIOStreams\\MergingFilesIntoSingleFile\\Source2.txt");
            FileOutputStream fos = new FileOutputStream("C:\\Users\\sanap\\Desktop\\Vacation Learning\\JavaIOStreams\\MergingFilesIntoSingleFile\\destination.txt");

            SequenceInputStream sis = new SequenceInputStream(fis1, fis2);

            int x;
            while((x = sis.read()) != -1)
            {
                fos.write(x);
            }

            fis1.close();
            fis2.close();
            fos.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
