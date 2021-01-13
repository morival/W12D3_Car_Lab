import components.Battery;
import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import people.Customer;
import vehicle_types.ElectricCar;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Engine engine;
    Tyres tyres;
    Battery battery;
    ElectricCar tesla;

    @Before
    public void setUp() {
        customer = new Customer(50000.00);
        engine = new Engine("Electric");
        tyres = new Tyres("eco");
        battery = new Battery("Panasonic");
        tesla = new ElectricCar(engine, tyres, 49999.00, battery);
    }

    @Test
    public void canRemoveMoneyFromWallet() {
        double amount = 30000.00;
        customer.pay(amount);
        assertEquals(20000.00, customer.getWallet(), 0.01);
    }

    @Test
    public void canAddVehicleToCollection() {
        customer.addVehicleToCollection(tesla);
        assertEquals(1, customer.getCollectionCount());
    }

    @Test
    public void canBuyVehicle() {
        customer.buyVehicle(tesla);
        assertEquals(1, customer.getCollectionCount());
        assertEquals(1.00, customer.getWallet(), 0.01);
    }
}
