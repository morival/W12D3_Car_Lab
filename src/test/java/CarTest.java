import org.junit.Before;
import vehicle_types.Car;
import components.Engine;
import components.Tyres;

public class CarTest {

    Car car;
    Engine engine;
    Tyres tyres;

    @Before
    public void setUp(){
        engine = new Engine("Petrol");
        tyres = new Tyres("Sport");
        car = new Car(engine, tyres, 30000.00, "Petrol");
    }



}
