
class Vehicle {
    String name;

    public Vehicle(String name) {
        this.name = name;
    }

    
    public void start() {
        System.out.println(name + " is starting...");
    }

    public void stop() {
        System.out.println(name + " is stopping...");
    }
}
class Car extends Vehicle {
    public Car(String name) {
        super(name);
    }


    public void start() {
        System.out.println(name + " starts with an ignition key.");
    }

    
    
    public void stop() {
        System.out.println(name + " stops by applying brakes.");
    }
}

class Bike extends Vehicle {
    public Bike(String name) {
        super(name);
    }

    /
    public void start() {
        System.out.println(name + " starts with a self-start or kick.");
    }

    
    public void stop() {
        System.out.println(name + " stops by applying hand brakes.");
    }
}


public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Car("Toyota");
        Vehicle v2 = new Bike("MT");

        System.out.println("Vehicle Operations:\n");

        v1.start();
        v1.stop();
        System.out.println();
        v2.start();
        v2.stop();
    }
}

