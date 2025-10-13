/*
 * interface is a complete abstract class 
 * it is used to group related methods with empty bodies
 * to access an interface method, the interface must be "implemented" (like inherited) by another class with the keyword "implements"
 * the body of the interface method is provided by the "implement" class
 */

interface Animal{
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
    public void ear();
}
class Pig implements Animal{
    public void animalSound(){
        System.out.println("The pig says: wee wee");
    }
    public void eat(){
        System.out.println("The pig is eating fruits");
    }
    public void sleep(){
        System.out.println("Pig sleeps : Zzz");
    }
   
}

public class Main {
    public static void main(String[] args) {
        Pig p = new Pig();
        p.animalSound();
        p.eat();
        p.sleep();
        
   }
}
