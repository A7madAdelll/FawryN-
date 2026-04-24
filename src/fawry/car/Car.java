package fawry.car;

import fawry.car.engines.Engine;

public class Car {
    private Engine engine;
    private boolean hasCarStarted=false;
    public Car(Engine engine) {
        this.engine = engine;
    }
    public void setEngine(Engine e){
        this.engine=e;
    }
    public void start(){
        if(!hasCarStarted){
            this.engine.setSpeed(0);
            hasCarStarted=true;
            System.out.println("car started speed = "+this.engine.getSpeed()+" km/h");
        }
        else{
            //can't start what is already has started
            System.out.println("car is already started");
        }
    }
    public void accelerate(){

        if(hasCarStarted){
        for (int i = 0; i < 20; i++) {
            if(this.engine.getSpeed()==200){
                System.out.println("car has hit the speed limit speed = 200 km/h");
                break;
            }
            System.out.println("accelerating... now speed is "+ this.engine.getSpeed());
            this.engine.increase();
        }
    }
        else{
            //can't breake while the cat hasn't started yet

            System.out.println("car hasn't start yet please start your car first");
        }
    }

    public void brake(){
        //can't breake while the cat hasn't started yet
        if(hasCarStarted){
            for (int i = 0; i < 20; i++) {
                if(this.engine.getSpeed()==0){
                    System.out.println("car has stopped now speed is "+ this.engine.getSpeed());
                    break;
                }
                else{
                    this.engine.decrease();
                    System.out.println("braking... now speed is "+ this.engine.getSpeed());
                }

            }

        }
        else{
            System.out.println("car hasn't started yet please start your car first");
        }
    }
    public void stop(){
if(hasCarStarted){
    System.out.println("stopping the car");
    while (this.engine.getSpeed()!=0){
        this.brake();
    }
    this.hasCarStarted=false;
}
else{
    System.out.println("car is aready stopped");
}

    }

public void printEngineType(){
    System.out.println(this.engine.getEngineType());
}


}
