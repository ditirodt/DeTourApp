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
public abstract class Employee {
     String employeeId;
     String first_name;
     String last_name;
     String DOB ;
     String gender;
     String address; 
     String titleOfEmployment ;
     String dateHired;
     double hoursWorked;
     double rateOfPay;
     double carAllowance;
     double monthlyPay;
     double taxRate;

    public Employee(String employeeId, String first_name, String last_name, String DOB, String gender, String address, String titleOfEmployment, String dateHired, double hoursWorked, double rateOfPay, double carAllowance, double monthlyPay, double taxRate) {
        this.employeeId = employeeId;
        this.first_name = first_name;
        this.last_name = last_name;
        this.DOB = DOB;
        this.gender = gender;
        this.address = address;
        this.titleOfEmployment = titleOfEmployment;
        this.dateHired = dateHired;
        this.hoursWorked = hoursWorked;
        this.rateOfPay = rateOfPay;
        this.carAllowance = carAllowance;
        this.monthlyPay = monthlyPay;
        this.taxRate = taxRate;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTitleOfEmployment() {
        return titleOfEmployment;
    }

    public void setTitleOfEmployment(String titleOfEmployment) {
        this.titleOfEmployment = titleOfEmployment;
    }

    public String getDateHired() {
        return dateHired;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getRateOfPay() {
        return rateOfPay;
    }

    public void setRateOfPay(double rateOfPay) {
        this.rateOfPay = rateOfPay;
    }

    public double getCarAllowance() {
        return carAllowance;
    }

    public void setCarAllowance(double carAllowance) {
        this.carAllowance = carAllowance;
    }

    public double getMonthlyPay() {
        return monthlyPay;
    }

    public void setMonthlyPay(double monthlyPay) {
        this.monthlyPay = monthlyPay;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeId=" + employeeId + ", first_name=" + first_name + ", last_name=" + last_name + ","
                + " DOB=" + DOB + ", gender=" + gender + ", address=" + address + ", titleOfEmployment=" + titleOfEmployment + ", dateHired="
                + dateHired + ", hoursWorked=" + hoursWorked + ", rateOfPay=" + rateOfPay + ", carAllowance=" + carAllowance + 
                ", monthlyPay=" + monthlyPay + ", taxRate=" + taxRate + '}';
    }

    

    
    
    
    public abstract double earnings();
    
    
    
}
