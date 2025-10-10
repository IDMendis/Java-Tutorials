/*
 * hashset is a collection of elements where every element is unique
 * part of the java.util pckg and implements the set interface
 */
import java.util.HashSet;


public class Main {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        cars.add("bmw");
         cars.add("BYD");
          cars.add("SUZUKI");
           cars.add("bmw");  //although bmw is written twice, this shows only one bmw
           cars.add("Toyota");
           System.out.println(cars);

         // System.out.println( cars.contains("Mazda"));

         for(String i : cars){
            System.out.println(i);
         }
/*
 * elements in a hashset are actually objects. here we created elements(objects) of type string
 */
    }
}
