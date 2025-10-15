import java.util.ArrayList;
import java.util.Collections;


//add elements
public class Test1 {
    public static void main(String[] args){
       // ArrayList<String> cars = new ArrayList<String>();
     var cars = new ArrayList<String>(); //both are same

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
// add new car to the 1st position/index 
        cars.add(1, "BYD");
        System.out.println(cars);
        
        System.out.println(cars.get(1));

        cars.set(0, "Opel");
        System.out.println(cars);

        cars.remove(2);
        System.out.println(cars);

        cars.size();
        System.out.println(cars.size());

        Collections.sort(cars);  //sort the arraylist
        for(String i : cars){
            System.out.println(i);
        }

    }
}
