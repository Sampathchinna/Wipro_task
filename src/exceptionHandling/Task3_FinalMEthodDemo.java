package exceptionHandling;

class Vehicle {
    final void engineType() {
        System.out.println("Engine type: Petrol");
    }
}

class Car extends Vehicle {
    // This will cause a compile-time error if you try to override engineType()
//     void engineType() {
//         System.out.println("Engine type: Electric");
//     }
}

public class Task3_FinalMEthodDemo {
    public static void main(String[] args) {
        Car c = new Car();
        c.engineType();
    }
}

