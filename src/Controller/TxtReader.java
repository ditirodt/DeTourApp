/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Ditiro
 */
public class TxtReader {
    Scanner sc;
    String line;
    String filepath;
    
    //constructor opens a file to read from
    public TxtReader(String filename)
            throws IOException
    {
        this.filepath = "G:\\ReadNSearch\\src\\readnsearch\\tutorial.txt.txt";
     //File file = new File(filename); 
         sc = new Scanner(new File(filepath));
    }
    
    //reads next line from the text file
    public boolean ReadNextLine()throws IOException
    {
        boolean lineRead; //flag varialble ie  you define to have one value until some condition is true
        
        //is there something to read
        lineRead = sc.hasNext();
        
        //if true, read the nextline 
        if(lineRead)
            line = sc.nextLine();
        return lineRead;
    }
    
    public void close()
    {
        sc.close();
    }
    
}
