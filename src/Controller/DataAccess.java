/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.nio.file.Paths;
import model.Employee;
import model.Management;
import model.SupportStaff;

/**
 *
 * @author parliament
 */
public class DataAccess {
    Scanner sc;
    String line;
    String filepath;
   // List<String> employees = new ArrayList<String>();
/**    
    //constructor opens a file to read from
    public DataAccess(String filename)
            
    {
        this.filepath = "G:\\ReadNSearch\\src\\readnsearch\\tutorial.txt.txt";
        try 
        {
            //File file = new File(filename);
            sc = new Scanner(new File(filepath));
            
        } catch (FileNotFoundException ex) {
            
           JOptionPane.showMessageDialog(null,"Record not found");
        }
    }
    
    //reads next line from the text file
    public boolean ReadNextLine()
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
    */
    public static List<Employee> readFile(String fileName){
        Path pathToFile = Paths.get(fileName);
        List<Employee> employees = new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {
            // read the first line from the text file 
            String line = br.readLine(); 
            // loop until all lines are read 
            while (line != null) { 
                // use string.split to load a string array with the values from 
                // each line of 
                // the file, using a comma as the delimiter 
                String[] attributes = line.split(","); 
                Employee employee = createEmp(attributes); 
                // adding emp into ArrayList 
                employees.add(employee); 
                // read next line before looping 
                // if end of file reached, line would be null 
                line = br.readLine(); 
                } 
        } catch (IOException ioe) {
            ioe.printStackTrace(); 
        } 
        return employees; 
    }
    
    private static Employee createEmp(String[] metadata) 
        { 
        String employeeId = metadata[0];
        String first_name  = metadata[1];
        String last_name = metadata[2];
        String DOB = metadata[3]; 
        String gender = metadata[4];
        String address  = metadata[5];
        String titleOfEmployment = metadata[6];
        String dateHired = metadata[7];
        double hoursWorked = Double.parseDouble(metadata[8]);
        double rateOfPay = Double.parseDouble(metadata[9]);
        double carAllowance = Double.parseDouble(metadata[10]);
        double monthlyPay = Double.parseDouble(metadata[11]);
        double taxRate = Double.parseDouble(metadata[12]); 
        // create and return book of this metadata 
        return new Employee(employeeId, first_name, last_name, DOB, gender,address, titleOfEmployment, dateHired, hoursWorked, rateOfPay,carAllowance, monthlyPay,taxRate  ) {
            @Override
            public double earnings() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }; 
        
        }

    //private static void Salaries()
    //public ArrayList return_method(ArrayList fruits)
   public static List<Employee> getArray() {
    List<Employee> employees = DataAccess.readFile("employees.txt");

    for (int i = 0; i < employees.size(); i++) {
        Employee employee = employees.get(i);
        if (employee.getTitleOfEmployment().contains("Management")) {
            employees.set(i, new Management(employee));
        } else {
            employees.set(i, new SupportStaff(employee));
        }
    } 
    return employees;
}
    }
    

