public abstract class Employee {

    String name;
    int employeeID;
    Double salary;

    public Employee(String name, int employeeID, Double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println("Employee Details:");
        System.out.println("Name: "+name);
        System.out.println("Employee ID: "+employeeID);
        System.out.println("Salary: "+salary);
    }
}
