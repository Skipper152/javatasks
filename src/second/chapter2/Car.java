package second.chapter2;

public class Car {
    private double distance;
    private double fuelQuantity;
    private double fuelEfficiency;

    public Car(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public void fillUpGas(double gas) {
        fuelQuantity += gas;
    }

    public void move(double miles) {
        if (miles / fuelEfficiency <= fuelQuantity) {
            distance += miles;
            fuelQuantity -= miles / fuelEfficiency;
        } else {
            System.out.println("Not enough fuel to drive " + miles + " miles!");
        }
    }

    public double getDistance() {
        return distance;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "distance=" + distance +
                ", fuelQuantity=" + fuelQuantity +
                ", fuelEfficiency=" + fuelEfficiency +
                '}';
    }
}
