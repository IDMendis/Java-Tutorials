public class PolyTest {
    
    public static void main(String[] args) {
        Cat c = new Cat();
        c.mi();
        c.m1(5);   
        c.m1("hi");
    }
}
class Cat{
    public void mi(){
        System.out.println("meow");
    }
    public void m1(int x) {
        System.out.println("purr");
    }
    public void m1(String s) {
        System.out.println("hiss");
    }
}// this is called method overloading. same methd name with different signatures