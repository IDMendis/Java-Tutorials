import java.util.LinkedList;
import java.util.Queue;

public class Queues{
    public static void main(String[] args){
    //queue is an interface it has implementd using LinkedList class
        Queue<String> newqueue = new LinkedList<>();
        
    
            System.out.println(newqueue.isEmpty());
            newqueue.add("Madoldoowa");
            newqueue.add("Viraagaya");
            newqueue.add("Oliver Twist");
            newqueue.add("Sherlock Holmes");
            System.out.println(newqueue);
            

            System.out.println(newqueue.size());

            System.out.println(newqueue.contains("Oliver Twist"));
            System.out.println(newqueue.peek());
            newqueue.poll();
            System.out.println(newqueue); //---------->First in First out principle
    }
}

