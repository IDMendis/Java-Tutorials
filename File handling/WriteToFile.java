import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("DinusTutorials.txt")){ //<-- this will create a FileWriter object
            fw.write("Welcome to Dinus Tutorials \n Learning java is fun!"); //<-- this will write the text to the file
            System.out.println("Successfully wrote to the file.");


        }catch( IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace(); //<--- this will print the error details

        }
    }}
