abstract class Animal{
//abstract methods - does not have a body
    public abstract void animalSound();
// regular method
    public void sleep(){
        System.out.println("Zzz");
    }
}

//subclass inherited from abstract class
class Pig extends Animal{
    public void animalSound(){
        System.out.println("The pig says: wee wee"); //<- this is the body of the abstract method
    }
}


public class Main {
    public static void main(String[] args) {
        Pig p = new Pig();
        p.animalSound();
        p.sleep();
    }
}
