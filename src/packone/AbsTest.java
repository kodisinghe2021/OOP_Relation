package packone;

abstract class Vehicle {

    abstract void park();
}

class Car extends Vehicle {

    @Override
    void park() {
        System.out.println("Car");
//To change body of generated methods, choose Tools | Templates.
    }

}

class Van extends Vehicle {

    @Override
    void park() {
        System.out.println("Van");
    }
}

class Bus extends Vehicle {

    @Override
    void park() {
        System.out.println("Bus");
    }

}

public class AbsTest {
    public static void main(String[] args) {
        Vehicle objCar;
        objCar = new Car();
        
        objCar.park();
        
    }
}
