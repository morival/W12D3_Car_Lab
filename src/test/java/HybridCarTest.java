import org.junit.Before;
import vehicle_types.HybridCar;
import components.Engine;
import components.Tyres;

public class HybridCarTest {

    HybridCar hybridCar;
    Engine engine;
    Tyres tyres;

    @Before
    public void setUp(){
        engine = new Engine("Petrol");
        tyres = new Tyres("Eco");
        hybridCar = new HybridCar(engine, tyres, 20000.00, "Petrol", true);
    }
}
