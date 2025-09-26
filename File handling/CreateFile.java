import java.io.File;
import java.io.IOException;

public class CreateFile {
  public static void main(String[] args) {
    try{
        File f = new File("D:\\Users\\Java Theory\\JTutorial.txt");
        if(f.createNewFile()){  //<-- this will try to create a new file
            System.out.println("File created: " + f.getName());
        }else{
            System.out.println("File already exists.");
        }

    }catch(IOException e){
        System.out.println("An error occurred.");
        e.printStackTrace(); //<--- this will print the error details
    }
  }  
}

