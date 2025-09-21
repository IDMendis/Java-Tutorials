public class Student {
//users cannot directly access the data we hide the data using private keyword
   private String name;
   private String regNo;
   private String address;
   private int age;

    Student(String name, String regNo, String address, int age) {
        this.name = name;
        this.regNo = regNo;
        this.address = address;
        this.age= age;

    }
    //we put others to access indirectly - encapsulation
    
    public void setAge(int age){
        if(age < 100){
            this.age=age;
        }else{
            System.out.println("Invalid Age!!");
        }
    }
    
    public void setName(String name){
        this.name = name;
    }
    public void setRegno(String regNo){
        this.regNo=regNo;
    }
    public void setAddress(String address){
        this.address= address;
    }

    public String getName(){
        return this.name;
    }
    public String getRegno(){
        return this.regNo;
    }
    public String getAddress(){
        return this.address;
    }
    public int getAge(){
        return this.age;
    }


    public String getDetails(){
        String s= "I am a student \n My name is "
        +this.name+".\n I am from "+this.address+
        ".\n My register number is "+this.regNo+".";
        return s;
    }
}
