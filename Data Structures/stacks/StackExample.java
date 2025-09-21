import java.util.Stack;

public class StackExample {

    public static void main(String[] args){
        //crete a stack
        Stack<String> stackofBooks = new Stack<>();
        
        //check if the stack is epty
        //System.out.println(stackofBooks.empty());   -----> true

        // push data
        stackofBooks.push("Madoldoowa");
        stackofBooks.push("Viraagaya");
        stackofBooks.push("Oliver Twist");
        stackofBooks.push("Sherlock Holmes");
        //System.out.println(stackofBooks.empty());
        System.out.println(stackofBooks);



        //pop an item

        stackofBooks.pop();
        System.out.println(stackofBooks);

        //name of the book which is in the top

        String bookAtTop = stackofBooks.peek();
        System.out.println("The Topmost Boook is - "+bookAtTop);
    }

    

}
