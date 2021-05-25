/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author parliament
 */
public class Management extends Employee{
   

    public Management(String employeeId, String first_name, String last_name, String DOB, String gender, String address, String titleOfEmployment, String dateHired, double hoursWorked, double rateOfPay, double carAllowance, double monthlyGratuity, double taxRate) {
        super(employeeId, first_name, last_name, DOB, gender, address, titleOfEmployment, dateHired, hoursWorked, rateOfPay, carAllowance, monthlyGratuity, taxRate);
    }
    
    public Management(Employee employee) {
    this(employee.getEmployeeId(), employee.getFirst_name(), employee.getLast_name(),
         employee.getDOB(), employee.getGender(), employee.getAddress(),
         employee.getTitleOfEmployment(), employee.getDateHired(), employee.getHoursWorked(),
         employee.getRateOfPay(), employee.getCarAllowance(), employee.getMonthlyPay(),
         employee.getTaxRate());
}

   

   
    
    

   
    
    
    @Override
    public  double earnings(){
         return super.hoursWorked*super.rateOfPay+carAllowance-super.taxRate;
    }
    
}
