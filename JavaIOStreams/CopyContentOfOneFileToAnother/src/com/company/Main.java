package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try
        {
            FileInputStream fip = new FileInputStream("C:\\Users\\sanap\\Desktop\\Vacation Learning\\JavaIOStreams\\CopyContentOfOneFileToAnother\\Test1.txt");
            FileOutputStream fop = new FileOutputStream("C:\\Users\\sanap\\Desktop\\Vacation Learning\\JavaIOStreams\\CopyContentOfOneFileToAnother\\Test2.txt");
            int x;
            while((x = fip.read()) != -1)
            {
                if(x<=90 && x>=65){
                    x = x+32;
                    fop.write(x);
                }
                else
                    fop.write(x);
            }
            fip.close();
            fop.close();

        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
