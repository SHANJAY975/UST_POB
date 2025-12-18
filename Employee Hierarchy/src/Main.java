public class Main {
    static void main(){
        // Creating instances of Manager and Developer
        Manager manager = new Manager("Alice", 101, 80000.0, 5);
        Developer developer = new Developer("Bob", 102, 60000.0, "Java");

        // Displaying information about each employee
        manager.displayDetails();
        developer.displayDetails();
    }
}