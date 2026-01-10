package com.ust.empapp;

import com.ust.empapp.model.Developer;
import com.ust.empapp.model.Employee;
import com.ust.empapp.model.Manager;
import com.ust.empapp.repository.EmployeeRepository;
import com.ust.empapp.repository.EmployeeRepositoryImpl;

public class Main {
    static void  main(){
        Employee emp1 = new Manager(101,"Harsh", 25000, 3);
        Employee emp2 = new Developer(104, "Karan", 10000, "java");

        EmployeeRepository employeeRepo = new EmployeeRepositoryImpl();

        employeeRepo.saveEmployee(emp1);
        employeeRepo.saveEmployee(emp2);

//        employeeRepo.deleteEmployee(101);
        var emp = employeeRepo.findEmployee(101);
        System.out.println(emp);

//        var emps = employeeRepo.getAllEmployees();
//        for(int i=0; i<EmployeeRepositoryImpl.current; i++){
//            if(emps[i]!=null) {
//                emps[i].displayDetails();
//            }
//        }

    }
}
