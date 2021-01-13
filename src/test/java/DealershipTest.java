import components.Battery;
import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import people.Dealership;
import vehicle_types.ElectricCar;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Engine engine;
    Tyres tyres;
    Battery battery;
    ElectricCar tesla;

    @Before
    public void setUp(){
        dealership = new Dealership(5000.00);
        engine = new Engine("Electric");
        tyres = new Tyres("eco");
        battery = new Battery("Panasonic");
        tesla = new ElectricCar(engine, tyres, 49999.00, battery);
    }

    @Test
    public void tillHasMoney(){
        assertEquals(5000.00, dealership.getTill(), 0.01);
    }

    @Test
    public void hasStock(){
        dealership.addVehicleToCollection(tesla);
        assertEquals(1, dealership.countStock());
    }

    @Test
    public void canAddMoneyToTill() {
        dealership.addMoneyToTill(20000.00);
        assertEquals(25000.00, dealership.getTill(), 0.01);
    }

    @Test
    public void canPayMoneyFromTill() {
        dealership.addMoneyToTill(50000.00);
        dealership.payForCar(45000.00);
        assertEquals(10000.00, dealership.getTill(), 0.01);
    }

    @Test
    public void canAddVehicleToStock() {
        dealership.addVehicleToCollection(tesla);
        assertEquals(1, dealership.countStock());
    }

    @Test
    public void canRemoveVehicleFromStock() {
        dealership.addVehicleToCollection(tesla);
        dealership.removeVehicleFromCollection(tesla);
        assertEquals(0, dealership.countStock());
    }

    @Test
    public void canBuyVehicle() {
        dealership.addMoneyToTill(45000.00);
        dealership.buyVehicle(tesla);
        assertEquals(1, dealership.countStock());
        assertEquals(1.00, dealership.getTill(), 0.01);
    }

    @Test
    public void canSellVehicle() {
        dealership.addVehicleToCollection(tesla);
        dealership.sellVehicle(tesla);
        assertEquals(0, dealership.countStock());
        assertEquals(54999.00, dealership.getTill(), 0.01);
    }

    @Test
    public void canRepairVehicle() {
        dealership.addVehicleToCollection(tesla);
        tesla.addDamage(2000);
        dealership.repairVehicle(1000, tesla);
        assertEquals(1, dealership.countStock());
        assertEquals(4000, dealership.getTill(), 0.01);
        assertEquals(48999, tesla.getPrice(), 0.01);
    }
}
