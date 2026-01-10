package basic;

import java.io.*;
import java.util.Scanner;

public class ReadingFileDemo {

    static void main() {

        //Byte Stream - InputStream
        //character Stream - Reader

        // First method using Byte Stream
//        try {
//            InputStream inputStream = new FileInputStream("hello.txt");
//            int ch;
//            while((ch =inputStream.read()) != -1){
//                System.out.print((char)ch);
//            }
//        }
//        catch(Exception e){
//            System.out.println(e.getMessage());
//        }
        //
        //  Second method using Character Stream
        try (Reader fileReader = new FileReader("hello.txt")) {
            try {
                //            Using Scanner
//            Scanner scanner = new Scanner(fileReader);
//            while (scanner.hasNext()){
//                String line = scanner.nextLine();
//                System.out.println(line);
//            }

                // Using BufferedReader
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                // Printing using Stream methods
//            bufferedReader.lines().forEach(line -> System.out.println(line));

                //Printing only line with java in it
                bufferedReader.lines().filter(l -> l.contains("java")).forEach(line -> System.out.println(line));
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
