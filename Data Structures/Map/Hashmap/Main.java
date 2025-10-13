import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //create a hashmap objects
        HashMap<String, Integer> people = new HashMap<>();
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);
        people.put("Mike", 30);
        people.put("Steve", 30);
        people.put("Steve", 30);

        //here steve is duplicated 3 times, however the latest value will overwrite the previous one
        //because keys in hashmaps must be unique

        //we can also use prople.get("John") to get the value of John
        //people.remove("John")
        //also people.clear()

        System.out.println(people);
    }
}
