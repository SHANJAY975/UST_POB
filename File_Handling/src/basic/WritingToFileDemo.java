package basic;
import java.io.FileWriter;
import  java.io.Writer;

public class WritingToFileDemo {
    static void main() {
        try(Writer writer = new FileWriter("hello.txt", true)){ // ,true is added to write in append mode. if nothing added then previous data in the file will be overriden
            writer.write("\nI like to learn new things");
            writer.append("\nI love India");
        }
        catch (Exception e){
            System.err.println(e);
        }
    }
}
