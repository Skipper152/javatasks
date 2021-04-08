package second.chapter2;

public class Car {
    private Double distance = Double.valueOf(0);
    private Double fuelQuantity = Double.valueOf(0);
    private Double fuelEfficiency;

    public Car(Double fuelEfficiency) {
        this.fuelEfficiency = Double.valueOf(fuelEfficiency);
    }

    public void fillUpGas(Double gas) {
        fuelQuantity += gas;
    }

    public void move(Double miles) {
        if (fuelQuantity.compareTo(miles / fuelEfficiency) >= 0) {
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
