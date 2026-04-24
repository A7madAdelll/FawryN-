import fawry.car.Car;
import fawry.car.CarFactory;
import fawry.car.engines.Engine.EngineType;

public class Main {

    public static void main(String[] args) {
        CarFactory factory =new CarFactory();

        // testing GAS engine car

        Car testCar = factory.createCar(EngineType.GAS);
        testCar.printEngineType(); //Gas
        testCar.start();           // start
        testCar.accelerate();      // +20 km/h
        testCar.brake();           // 0
        testCar.accelerate();      // 20
        testCar.stop();            // 0
        testCar.stop();            // still 0  stopped
        System.out.println();
        System.out.println();

        factory.replaceEngine(testCar,EngineType.HYBRID);
        testCar.printEngineType();  //HYBRID
        testCar.accelerate();       //didn't start yet
        testCar.start();            // start
        testCar.accelerate();       // 20
        testCar.accelerate();       // 40
        testCar.accelerate();       // 40 -> 50  Elctric engine works / 51 -> 60 Gas engine works
        testCar.stop();             // 60 -> 50  Gas engine works / 50 -> 0 Elctric engine works  stopped

        System.out.println();
        System.out.println();

        factory.replaceEngine(testCar,EngineType.ELECTRIC);
        testCar.printEngineType();  // ELECTRIC
        testCar.stop();             //didn't start yet
        testCar.accelerate();       //didn't start yet
        testCar.brake();            //didn't start yet
        testCar.start();            // start
        testCar.accelerate();       //20
        testCar.brake();            //0
        testCar.brake();            //0
        testCar.stop();             //0 stopped
        testCar.accelerate();       //didn't start yet


    }
}