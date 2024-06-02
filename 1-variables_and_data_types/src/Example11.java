// Java inheritance

public class Example11 {
    public static void main(String[] args){
        final Car car = new Car();

        car.honk();

        System.out.println("Beautiful "+ car.modelName+ " is it " + car.model + "?");

    }
}


// final class Vehicle { // This will cause an error because final class can't be inherited
  class Vehicle {
    protected String brand = "Ford";

    public void honk(){
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
    final String modelName = "F-150 Raptor";
    final int model = 2025;


}
