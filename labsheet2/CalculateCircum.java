package labsheet2;
// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class CalculateCircum {
   double pi = 3.14;

   public CalculateCircum() {
   }

   double calculteArea(int var1) {
      return this.pi * (double)var1 * (double)var1;
   }

   public static void main(String[] var0) {
      CalculateCircum var1 = new CalculateCircum();
      double var2 = var1.calculteArea(4);
      System.out.println("The area is " + var2);
   }
}
