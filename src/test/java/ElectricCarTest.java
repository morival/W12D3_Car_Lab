import components.Battery;
import org.junit.Before;
import org.junit.Test;
import vehicle_types.ElectricCar;
import components.Engine;
import components.Tyres;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;
    Engine engine;
    Tyres tyres;
    Battery battery;

    @Before
    public void setUp() {
        engine = new Engine("Electric");
        tyres = new Tyres("Eco");
        battery = new Battery("Panasonic");
        electricCar = new ElectricCar(engine, tyres, 15000.00, battery);
    }

    @Test
    public void DmgCanReducePrice() {
        double damage = 2000.00;
        electricCar.addDamage(damage);
        assertEquals(13000.00, electricCar.getPrice(), 0.01);
    }
}
