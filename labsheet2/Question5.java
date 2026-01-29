package labsheet2;

import java.util.Scanner;

public class Question5 {
    
    public static void main(String[] args) {
        Question5 q5 = new Question5();
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the first subject marks: ");
        int firstSubjectMarks = sn.nextInt();
        System.out.println("Enter the second subject marks: ");
        int secondSubjectMarks = sn.nextInt();
        System.out.println("Enter the third subject marks: ");
        int thirdSubjectMarks = sn.nextInt();
        System.out.println("Enter the Fourth subject marks: ");
        int fourthSubjectMarks = sn.nextInt();
        System.out.println("Enter the Fifth subject marks: ");
        int fifthSubjectMarks = sn.nextInt();

        int totalMarks = firstSubjectMarks + secondSubjectMarks + thirdSubjectMarks + fourthSubjectMarks + fifthSubjectMarks;
        double averageMarks = totalMarks/ 5.0;
        System.out.println("The total marks is: " + totalMarks);
        System.out.println("The average marks is: " + averageMarks);
    }
}
