import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList<String> cars = new LinkedList<>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");  
        cars.removeLast();

        cars.addFirst("Toyota");
        cars.addLast("Honda");

        System.out.println(cars);
        System.out.println("2nd indes is: "+cars.get(2));

    }
}
