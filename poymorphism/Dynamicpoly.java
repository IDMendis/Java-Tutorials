public class Dynamicpoly {
    //example for dynamic polymorphism

    public static void main(String[] args) {
        Animal[] a = new Animal[3]; // dynamic polymorphism
        Animal a1 = new Animal();
        Cat c = new Cat();
        Dog d = new Dog();
        a[0] = a1;
        a[1] = c;
        a[2] = d;

        for(int i=0;i<3;i++){
            a[i].speak();
        }
    }
}
class Animal{
        String name;
        void speak() {
            System.out.println("Animal speaks");
        }
}
  class Cat extends Animal{
            @Override
            void speak() {
                System.out.println("Cat meows");
            }

        }
 class Dog extends Animal{
                int age;
                @Override
                void speak() {
                    System.out.println("Dog barks");
                }
        }