package basic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadingFileWithNIO {
    static void main() throws IOException {
        try{
            // One line code
//            Files.lines(Paths.get("hello.txt")).forEach(line-> System.out.println(line));

            // Another method
            Path path = Paths.get("hello.txt");

//            Files.lines(path).forEach(line-> System.out.println(line));

            // another method
            try(Stream<String> lines = Files.lines(path)){
                lines.forEach(line-> System.out.println(line));
            }
            catch(IOException io){
                throw new IOException(io);
            }
        }
        catch(IOException io){
            throw new IOException(io);
        }
    }


}
