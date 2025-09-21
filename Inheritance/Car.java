class Vehicle{
    protected String brand = "Ford";         // Vehicle attribute
    public void honk() {                     // Vehicle method
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle{
    private String modelname = "Mustang";    // Car attribute

    public static void main(String[]args){
        Car c = new Car();
        c.honk();
        System.out.println(c.brand + " " + c.modelname);
    }
}