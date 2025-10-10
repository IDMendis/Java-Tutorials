import java.util.ArrayList;
import java.util.Collections;

public class Ex01 {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        numbers.add(8);
        numbers.add(30);

        Collections.sort(numbers);  // Sort the ArrayList in ascending order

        for(int i : numbers){
            System.out.println(i);
        }
    }
}
