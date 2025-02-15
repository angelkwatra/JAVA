abstract class Vehicle {
    protected String company;
    protected String model;

    public Vehicle(String company, String model) {
        this.company = company;
        this.model = model;
    }

    public abstract void startEngine();
    public abstract void stopEngine();

    public void serviceInfo() {
        System.out.println("Regular servicing is required for optimal performance.");
    }
}

class Car extends Vehicle {
    public Car(String company, String model) {
        super(company, model);
    }

    @Override
    public void startEngine() {
        System.out.println("The engine of " + company + " " + model + " is starting");
    }

    @Override
    public void stopEngine() {
        System.out.println("The engine of " + company + " " + model + " is stopping");
    }
}

public class L5q4 {
    public static void main(String[] args) {
        Car myCar = new Car("Maruti", "Swift");
        myCar.startEngine();
        myCar.serviceInfo();
        myCar.stopEngine();
    }
}
