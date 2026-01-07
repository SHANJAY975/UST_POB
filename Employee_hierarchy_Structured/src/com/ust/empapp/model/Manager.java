package com.ust.empapp.model;

public class Manager extends Employee {
    private int teamsize;

    public  Manager(int employeeId, String name, double salary, int teamsize){
        super(employeeId,name,salary);
        this.teamsize = teamsize;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("Programming Language : "+teamsize);
    }
}
