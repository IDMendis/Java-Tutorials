public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("nipun", "12345", "kathmandu",67);
        s1.setAge(89);
        

        System.out.println("Name: " + s1.getName());
        System.out.println("RegNo: " + s1.getRegno());
        System.out.println("Address: " + s1.getAddress());
        System.out.println("Age :"+s1.getAge());
        System.out.println(s1.getDetails());
    }
}

