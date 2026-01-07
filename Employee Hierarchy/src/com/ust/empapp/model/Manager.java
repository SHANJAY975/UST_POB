package com.ust.empapp.model;

public class Manager extends Employee {
    private int teamsize;

    public Manager(String name, int employeeID, Double salary, int teamsize) {
        super(name, employeeID, salary);
        this.teamsize = teamsize;
    }

    public  void displayDetails(){
        super.displayDetails();
        System.out.println("Team Size: "+teamsize);
        System.out.println();
    }
}
