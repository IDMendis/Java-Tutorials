public class MultipleExceptions {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        try{
            int[] numbers = {1,2,3};
            System.out.println(numbers[5]);
            int result = 10/0;
        }
    //     }catch(ArrayIndexOutOfBoundsException e){
    //         System.out.println("Error: Attempted to access an invalid index in the array.");
    // }
        catch(ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed.");
        }
        catch(Exception e){
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
        finally{
            System.out.println("Execution of the try-catch block is complete.");
        }
    }
    
}
