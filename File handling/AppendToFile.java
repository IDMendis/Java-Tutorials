// by using append mode in FileWriter you can add new contents
// to an existing file without deleting what's already there.
import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("DinusTutorials.txt", true)){ //<-- 'true' enables append mode
            fw.write("\nThis is an appended line."); //<-- this will append the text to the file
            System.out.println("Successfully appended to the file.");
}catch (Exception e) {
    System.out.println("An error occurred.");
    e.printStackTrace(); //<--- this will print the error details
}
    }
}
