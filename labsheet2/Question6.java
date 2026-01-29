import java.util.Scanner;

public class Question6 {
  
    public static void main(String[] args) {
        Question6 q6 = new Question6();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Total Distance travelled in Km: ");
        int distance = sc.nextInt();
        System.out.println("Enter the Total Fuel consumed in Litres: ");
        int fuel = sc.nextInt();
        double mileage = (double) distance / fuel;
        System.out.println("The mileage of the vehicle is: " + mileage + " Km/L");
    }
}
