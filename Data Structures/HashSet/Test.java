import java.util.HashSet;

public class Test {
    public static void main(String[] args) {

        //hashset objecct called numbers
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(4);
         numbers.add(5);
        numbers.add(7);
        numbers.add(4);
         numbers.add(9);

        for(int i= 1; i<= 10; i++){
            if (numbers.contains(i)) {
                System.out.println(i+" was found in the hashset");
            }else{
                System.out.println(i+ " wasn't found");
            }
        }
    }
}
