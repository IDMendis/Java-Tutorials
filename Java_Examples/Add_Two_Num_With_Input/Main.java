import java.util.Scanner;

class Main{
    public static void main(String[] args){
        int num1, num2, sum;
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1= sn.nextInt(); //read the user input

        System.out.print("Enter the second input: ");
        num2 = sn.nextInt();
        sum = num1 + num2; //adding two numbers
        System.out.println("The sum of two numbers is: " + sum);
    }
}