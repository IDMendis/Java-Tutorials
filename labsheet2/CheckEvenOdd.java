import java.util.Scanner;
public class CheckEvenOdd {
    void isEvenOdd(int number){
        if(number % 2 == 0){
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }

    public static void main(String[] args) {
        CheckEvenOdd c1 = new CheckEvenOdd();
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter a number to check Even or Odd:");
        int number = sn.nextInt();
        c1.isEvenOdd(number);
    }
    
}
