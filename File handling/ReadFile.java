import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile{
    public static void main(String[] args) {
        File f = new File("DinusTutorials.txt");

        try(Scanner myReader = new Scanner(f )){
            while (myReader.hasNextLine()){ // this will check if there is another line to read
                String data = myReader.nextLine(); // this will read the next line
                System.out.println(data);{
                
            }
            
        }
    }catch(FileNotFoundException e){
        System.out.println("An error occurred.");
        e.printStackTrace(); //<--- this will print the error details
        }
    }
}
