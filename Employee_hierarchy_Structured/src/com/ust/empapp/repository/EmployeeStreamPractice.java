package com.ust.empapp.repository;

import com.ust.empapp.model.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeStreamPractice implements EmployeeRepository{

    List<Employee> employees = new ArrayList<>();
    public static int current = 0;
    @Override
    public void saveEmployee(Employee employee) {

        employees.add(employee);
    }

    @Override
    public Employee findEmployee(int id) {
        return  employees.stream().filter(e-> e.getEmployeeId() == id).findAny().orElse(null);
    }

    @Override
    public void deleteEmployee(int id) {
//
//        Employee emp = findEmployee(id);
//        employees.remove(emp);

        employees.removeIf(e -> e.getEmployeeId() == id);

    }

    @Override
    public List<Employee> getAllEmployees() {

        return employees;
    }

    @Override
    public Employee findEmployeeByName(String name) {
        return employees.stream().filter(e-> e.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
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

        return employees.stream().max((e1,e2)-> Double.compare(e1.getSalary(), e2.getSalary())).get();
    }


}
