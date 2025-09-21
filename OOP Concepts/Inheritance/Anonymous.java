class Animal{
    public void sound(){
        System.out.println("Animal makes a sound");
    }
}


public class Anonymous {
    public static void main(String[] args) {
        Animal a = new Animal(){
            @Override
            public void sound(){
                System.out.println("Dog says: Bow Bow");
            }
        };
        a.sound();
    }
    
}
