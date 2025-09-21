class Animal{
    public void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Cow extends Animal{
  
    @Override
    public void sound(){
        //super.sound();
        System.out.println("Cow says: Moo Moo");
    }
    
}




public class Main {
    public static void main(String[] args) {
        Cow c = new Cow();
        c.sound();
        

    }
}
