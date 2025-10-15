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
// Collections.sort(cars, Collections.reverseOrder());   this reverses the list
        for(int i : numbers){
            System.out.println(i);
        }
    }
}


/* set interface is used to store collection of unique elements
 * unlike Lists, sets does not allow duplicates
 * common clases that implements sets are - hashsets, treesets, linkedhashsets
 * USE A SET WHEN YOU NEED TO STORE UNIQUE VALUES ONLY....!
 */
