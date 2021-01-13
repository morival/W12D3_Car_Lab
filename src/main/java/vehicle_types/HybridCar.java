package vehicle_types;
import components.Engine;
import components.Tyres;

public class HybridCar extends Vehicle {

    private String fuelType;
    private boolean chargePoint;

    public HybridCar(Engine engine, Tyres tyre, double price, String fuelType, boolean chargePoint) {
        super(engine, tyre, price);
        this.fuelType = fuelType;
        this.chargePoint = chargePoint;
    }

    public String getFuelType() {
        return this.fuelType;
    }

    public boolean hasChargePoint() {
        return this.chargePoint;
    }
}
