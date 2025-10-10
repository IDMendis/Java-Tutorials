
/*
 * treeset is used to store elements in a sorted way
 * hashsets has no order but treeset has order they are sorted automatically
 * performance is bit slower due to sorting
 */
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> cars = new TreeSet<>();
        cars.add("BMW");
         cars.add("apple");
         cars.add("BYD");
          cars.add("SUZUKI");
           cars.add("BYD");
            cars.add("BYD");
           cars.add("Toyota");
           System.out.println(cars);

         // System.out.println( cars.contains("Mazda"));
        cars.clear();
         for(String i : cars){
            System.out.println(i);
         }
    }
}
