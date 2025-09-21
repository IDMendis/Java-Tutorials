

public class Main {
    
    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args){
        Day today = Day.MONDAY;
        System.out.println("Today is: " + today);
    }
}
