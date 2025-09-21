package pkgB;
import pkgA.*;
public class Cat extends Dog {
     int k = 3;
     int a=12;
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat c = new Cat();
        int a=0;

      
    }
    void test(){
           System.out.println("superclass a is"+super.a);
        System.out.println("instance a"+this.a);
         System.out.println("local a "+ a);
        //  System.out.println("second"+myDog.b);
        //   System.out.println("third"+myDog.c);
           System.out.println("k -"+ this.k);  //this isa non static var so we cannot use this.a
    }
}
