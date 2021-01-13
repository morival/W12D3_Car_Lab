package people;

import vehicle_types.Vehicle;


import java.util.ArrayList;

public class Customer {
    private double wallet;
    ArrayList<Vehicle> collectionOfVehicles;

    public Customer(double wallet) {
        this.wallet = wallet;
        this.collectionOfVehicles = new ArrayList<>();
    }

    public double getWallet() {
        return wallet;
    }

    public ArrayList<Vehicle> getCollectionOfVehicles() {
        return collectionOfVehicles;
    }

    public void addVehicleToCollection(Vehicle vehicle) {
        this.collectionOfVehicles.add(vehicle);
    }

    public int getCollectionCount() {
        return this.collectionOfVehicles.size();
    }

    public void pay(double amount) {
        wallet -= amount;
    }
    
    public void buyVehicle(Vehicle vehicle) {
        if (this.getWallet() >= vehicle.getPrice()) {
            pay(vehicle.getPrice());
            addVehicleToCollection(vehicle);
        }
    }
}
