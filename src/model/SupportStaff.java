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
public class SupportStaff extends Employee {

    public SupportStaff(String employeeId, String first_name, String last_name, String DOB, String gender, String address, String titleOfEmployment, String dateHired, double hoursWorked, double rateOfPay, double carAllowance, double monthlyPay, double taxRate) {
        super(employeeId, first_name, last_name, DOB, gender, address, titleOfEmployment, dateHired, hoursWorked, rateOfPay, carAllowance, monthlyPay, taxRate);
    }
    
    public SupportStaff(Employee employee) {
    this(employee.getEmployeeId(), employee.getFirst_name(), employee.getLast_name(),
         employee.getDOB(), employee.getGender(), employee.getAddress(),
         employee.getTitleOfEmployment(), employee.getDateHired(), employee.getHoursWorked(),
         employee.getRateOfPay(), employee.getCarAllowance(), employee.getMonthlyPay(),
         employee.getTaxRate());
}


    
    @Override
     public double getMonthlyPay() {
         double salary = super.getMonthlyPay();
        return (salary+super.carAllowance);
    }
  
    

    @Override
    public  double earnings(){
        return getMonthlyPay(); 
    }
  
    @Override
   public String toString() {
      return super.toString();
   }
  
  
  
}
    

