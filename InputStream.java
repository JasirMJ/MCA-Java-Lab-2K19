/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Infinity Thrissur
 */
public class InputStream {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("myText.txt");
        FilterOutputStream filt = new FilterOutputStream(fos);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String");
        String ab = sc.nextLine();  
        byte[] buffer = ab.getBytes();
        byte [] buff = {65,66,67,68};
        filt.write(buffer);
        filt.write(buff);
        filt.flush();
        System.out.println("File Written");
        char c;
        FileInputStream fis = new FileInputStream("myText.txt");
        int a ;
        while( (a = fis.read()) != -1){
            c = (char) a;
            System.out.print(c);
        }
        
        System.out.println("");
        System.out.println("Done!");
    }
}
