package vehicle_types;
import components.Engine;
import components.Tyres;

public class Car extends Vehicle{

    private String fuelType;

    public Car(Engine engine, Tyres tyre, double price, String fuelType) {
        super(engine, tyre, price);
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }
}
