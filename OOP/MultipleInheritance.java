interface Engine {
    void startCar();
}

interface BreakCar {
    void stopCar();
}

class Car implements Engine, BreakCar {
    public void startCar() {
        System.out.println("Car engine started");
    }

    public void stopCar() {
        System.out.println("Car did stop");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.startCar();
        c1.stopCar();
    }
}
