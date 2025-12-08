package Java_Examples.reverse_a_number;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int num = s.nextInt();
        int reversedNum = 0;

        while(num !=0){
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;


        }
        System.out.println("Reversed Number: " + reversedNum);

    }
   

}
