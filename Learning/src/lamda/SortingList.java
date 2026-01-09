package lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingList {
    void main(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Harsh", 25000));
        employees.add(new Employee(102, "Adithi", 18000));
        employees.add(new Employee(105, "Rohan", 32000));
        employees.add(new Employee(104, "Meera", 21000));
        employees.add(new Employee(103, "Kabir", 27500));

        Collections.sort(employees,(e1,e2)-> Double.compare(e1.getSalary(),e2.getSalary()));

//        for(var emp: employees) {
//            System.out.println(emp);
//        }
        employees.forEach(e-> System.out.println(e));
    }
}
