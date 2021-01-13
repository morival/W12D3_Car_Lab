package vehicle_types;

import components.Engine;
import components.Tyres;

public abstract class Vehicle {
    Engine engine;
    Tyres tyres;
    double price;

    public Vehicle(Engine engine, Tyres tyres, double price){
        this.engine = engine;
        this.tyres = tyres;
        this.price = price;
    }

    public Engine getEngine(){
        return this.engine;
    }

    public Tyres getTyres(){
        return this.tyres;
    }

    public double getPrice() {
        return this.price;
    }

    public void addDamage(double amount) {
        this.price -= amount;
    }

    public void repair (double amount) {
        this.price += amount;
    }
}
