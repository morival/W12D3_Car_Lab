package people;

import vehicle_types.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private double till;
    private ArrayList<Vehicle> vehicleStock;

    public Dealership(double till){
        this.till = till;
        this.vehicleStock = new ArrayList<Vehicle>();
    }

    public double getTill() {
        return this.till;
    }

    public ArrayList<Vehicle> getVehicleStock() {
        return this.vehicleStock;
    }

    public void addVehicleToCollection(Vehicle vehicle){
        this.vehicleStock.add(vehicle);
    }

    public void removeVehicleFromCollection(Vehicle vehicle){
        this.vehicleStock.remove(vehicle);
    }

    public int countStock(){
       return this.vehicleStock.size();
    }

    public void addMoneyToTill(double amount){
        this.till += amount;
    }

    public void payForCar(double amount) {
        this.till -= amount;
    }

    public void buyVehicle(Vehicle vehicle) {
        if (vehicle.getPrice() <= this.till) {
            payForCar(vehicle.getPrice());
            addVehicleToCollection(vehicle);
        }
    }

    public void sellVehicle(Vehicle vehicle) {
        if (this.vehicleStock.contains(vehicle)) {
            addMoneyToTill(vehicle.getPrice());
            removeVehicleFromCollection(vehicle);
        }
    }

    public void repairVehicle(double amount, Vehicle vehicle) {
        payForCar(amount);
        vehicle.repair(amount);
    }


}
