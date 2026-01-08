package com.ust.empapp.repository;

import com.ust.empapp.model.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class EmployeeCompareByName implements Comparator<Employee> {

    public int compare(Employee e1, Employee e2){
        return  e1.getName().compareTo(e2.getName());
    }

}

class EmployeeCompareBySalary implements Comparator<Employee> {

    public int compare(Employee e1, Employee e2){
        return  (int)(e1.getSalary() - e2.getSalary());
    }

}

public class EmployeeRepositoryImpl implements EmployeeRepository{

    List<Employee> employees = new ArrayList<>();
    public static int current = 0;
    @Override
    public void saveEmployee(Employee employee) {

        employees.add(employee);
    }

    @Override
    public Employee findEmployee(int id) {
        for(Employee emp: employees){
            if(emp.getEmployeeId() == id){
                return  emp;
            }
        }
        return null;
    }

    @Override
    public void deleteEmployee(int id) {

        Employee emp = findEmployee(id);
        employees.remove(emp);

    }

    @Override
    public List<Employee> getAllEmployees() {

        return employees;
    }

    @Override
    public Employee findEmployeeByName(String name) {
        for(Employee emp: employees){
            if(emp.getName().equalsIgnoreCase(name)){
                return  emp;
            }
        }
        return null;
    }

    @Override
    public List<Employee> findEmployeeInSalaryRange(double min, double max) {
        List<Employee> list = new ArrayList<>();
        for(var emp: employees){
            if(emp.getSalary()>=min && emp.getSalary()<=max){
                list.add(emp);
            }
        }
        return  list;
    }

    @Override
    public List<Employee> sortBySalary() {
//        Collections.sort(employees);
//        return employees;
        Comparator<Employee> comparator = new EmployeeCompareBySalary();
        employees.sort(comparator);
        return  employees;
//        Another way of sorting
//        return  employees.stream().sorted(comparator).toList();

    }

    @Override
    public Employee findHighestPaidEmployee() {
        Employee high = null;
        if(!employees.isEmpty()) {
            high = employees.get(0);
            for (var emp : employees) {
                if(emp.getSalary() > high.getSalary()){
                    high = emp;
                }
            }
        }
        return  high;
    }


}
