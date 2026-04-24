import fawry.car.Car;
import fawry.car.CarFactory;
import fawry.car.engines.Engine.EngineType;

public class Main {

    public static void main(String[] args) {
        CarFactory factory =new CarFactory();

        // testing GAS engine car

        Car testCar = factory.createCar(EngineType.GAS);
        testCar.printEngineType();
        testCar.start();
        testCar.accelerate();
        testCar.brake();
        testCar.accelerate();
        testCar.stop();
        testCar.stop();
        System.out.println();
        System.out.println();

        factory.replaceEngine(testCar,EngineType.HYBRID);
        testCar.printEngineType();
        testCar.accelerate();
        testCar.start();
        testCar.accelerate();
        testCar.accelerate();
        testCar.accelerate();
        testCar.stop();


    }
}