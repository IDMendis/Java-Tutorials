package labsheet2;

import java.util.Scanner;

public class Question4 {
     public static void main(String[] args) {
        Question4 q4 = new Question4();
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = sn.nextInt();
        System.out.println("the square root of "+number +"is:"+Math.sqrt(number));
    }
    
}
