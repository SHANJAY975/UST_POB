import com.ust.empapp.model.Developer;
import com.ust.empapp.model.Employee;
import com.ust.empapp.model.Manager;

public class Main {
    static void main(){
        // Creating instances of com.ust.empapp.model.Manager and com.ust.empapp.model.Developer
        Employee manager = new Manager("Alice", 101, 80000.0, 5);
        Employee developer = new Developer("Bob", 102, 60000.0, "Java");

        // Displaying information about each employee
        manager.displayDetails();
        developer.displayDetails();
    }
}