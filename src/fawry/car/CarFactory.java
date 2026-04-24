package fawry.car;

import fawry.car.engines.ElectricEngine;
import fawry.car.engines.Engine;
import fawry.car.engines.GasEngine;
import fawry.car.engines.HybridEngine;
import fawry.car.engines.Engine.EngineType;

public class CarFactory {
    void CarFactory(){

    }
public Car createCar(Engine.EngineType e){
Engine newEngine = createEngine(e);
Car newCar= new Car(newEngine);

return newCar;
}
public void replaceEngine(Car car,EngineType e){
        Engine newEngine= createEngine(e);
        car.setEngine(newEngine);
}


private Engine createEngine(Engine.EngineType e){
    if(e== EngineType.GAS){
        return new GasEngine();
    }
    else if(e== EngineType.ELECTRIC){
    return new ElectricEngine();
    }
    else {
        return new HybridEngine();
    }

}


}
