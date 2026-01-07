package com.ust.empapp.model;

public abstract class Employee {

    private String name;
    private int employeeID;
    private Double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Employee(String name, int employeeID, Double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println(getClass().getSimpleName()+" Details:");
        System.out.println("Name: "+name);
        System.out.println("Employee ID: "+employeeID);
        System.out.println("Salary: "+salary);
    }
}
