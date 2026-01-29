package labsheet2;

// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class CeltoFahren {
   public CeltoFahren() {
   }

   void convertToFahren(double var1) {
      double var3 = var1 * 9.0 / 5.0 + 32.0;
      System.out.println("The fahrenheite value is " + var3 + "F");
   }

   public static void main(String[] var0) {
      CeltoFahren var1 = new CeltoFahren();
      var1.convertToFahren(2.5);
   }
}
