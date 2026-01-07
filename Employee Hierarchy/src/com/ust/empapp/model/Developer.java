package com.ust.empapp.model;

public class Developer extends  Employee{
    private String programmingLanguage;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public Developer(String name, int employeeID, Double salary, String programmingLanguage) {
        super(name, employeeID, salary);
        this.programmingLanguage = programmingLanguage;
    }
    public  void displayDetails(){
        super.displayDetails();
        System.out.println("Programming Language: "+programmingLanguage);
        System.out.println();
    }

}
