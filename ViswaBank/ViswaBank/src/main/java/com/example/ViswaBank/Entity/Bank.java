package com.example.ViswaBank.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bank {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private long EmployeeID;
    private String EmployeeName;
    private String Designation;
    private String EmployeeDepartment;
    private String EmployeeBranch;
    private double salary;

    public long getEmployeeID() {
        return EmployeeID;
    }

   /* public void setEmployeeID(int employeeID) {
        EmployeeID = employeeID;
    }*/

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public String getEmployeeDepartment() {
        return EmployeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        EmployeeDepartment = employeeDepartment;
    }

    public String getEmployeeBranch() {
        return EmployeeBranch;
    }

    public void setEmployeeBranch(String employeeBranch) {
        EmployeeBranch = employeeBranch;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Bank(String employeeName, String designation, String employeeDepartment, String employeeBranch, double salary) {
        EmployeeName = employeeName;
        Designation = designation;
        EmployeeDepartment = employeeDepartment;
        EmployeeBranch = employeeBranch;
        this.salary = salary;
    }

    public Bank() {

    }
}
