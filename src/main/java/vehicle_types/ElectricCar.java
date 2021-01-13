package vehicle_types;

import components.Engine;
import components.Tyres;
import components.Battery;

public class ElectricCar extends Vehicle {

    Battery battery;

    public ElectricCar(Engine engine, Tyres tyres, double price, Battery battery) {
        super(engine, tyres, price);
        this.battery = battery;

    }

}
