

public class ThrowDemo {

    static void checkAge(int agr){
        if(agr<18){
            throw new ArithmeticException("Access Denied! -Age must be at least 18 to vote.");
        }
        else{
            System.out.println("Access Granted! - You are old enough to vote.");
        }
}
    public static void main(String[] args) {
        checkAge(17); // This will throw an exception
    }
}
