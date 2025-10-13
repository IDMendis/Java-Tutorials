//collection that stores no duplicate elements
//and remembers the order they were added

//when you want a set that does not contain duplicates and keeps the original insertion order
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> fruits = new LinkedHashSet<>();

        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Apple"); // will not be added ( bec duplicate)

        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println(fruits.contains("Mango"));
        
        System.out.println(fruits.contains("woodapple"));
        fruits.add( "Kiwi"); // will not work ( bec no index)
                System.out.println(fruits);
    }
}
