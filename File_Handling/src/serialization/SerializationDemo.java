package serialization;

import java.io.*;

public class SerializationDemo {

    static void main() {

        // Write Object to File (i.e Serialization)
//        try(OutputStream outputStream = new FileOutputStream("employee.ser");
//            ObjectOutputStream objectOutputStream  = new ObjectOutputStream(outputStream))
//        {
//            Employee employee = new Employee(1, "Harsh", 60000);
//            objectOutputStream.writeObject(employee);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

        // Read (Deserialization)
        try(InputStream inputStream = new FileInputStream("employee.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream))
        {
            System.out.println(objectInputStream.readObject());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
