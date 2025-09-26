public class TryCatchDemo {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access an invalid index in the array.");
        } finally {
            System.out.println("Execution of the try-catch block is complete.");
        } //finally bloclk is optional it lets you execute code after try and catch regardless of the outcome
    }
}