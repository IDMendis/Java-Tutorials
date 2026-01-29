package labsheet2;
import java.util.Scanner;

public class Question3 {
   public Question3() {
   }

   double calculateAngle(double var1, double var3) {
      double var5 = 180.0 - (var1 + var3);
      return var5;
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      Question3 var2 = new Question3();
      System.out.print("Enter the First angle: ");
      double var3 = var1.nextDouble();
      System.out.print("Enter the Second angle: ");
      double var5 = var1.nextDouble();
      double var7 = var2.calculateAngle(var3, var5);
      System.out.println("The Third angle is: " + var7);
   }
}



