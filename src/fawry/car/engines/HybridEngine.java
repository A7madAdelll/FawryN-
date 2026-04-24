package fawry.car.engines;

public class HybridEngine implements Engine{
    private int speed;
    private ElectricEngine electricEngineInHyprid;
    private GasEngine gasEngineInHypred;
    private Engine activeEngine;
    public HybridEngine() {
        this.electricEngineInHyprid = new ElectricEngine();
        this.gasEngineInHypred = new GasEngine();
        this.activeEngine=electricEngineInHyprid;
    }

    @Override
    public void decrease() {
        this.speed--;
        checkSpeed();
        System.out.println("hypered Engine decreasing");
        activeEngine.decrease();
    }

    @Override
    public void increase() {
        this.speed++;
        checkSpeed();
        System.out.println("hypered Engine increasing");
        activeEngine.increase();
    }
    void checkSpeed(){

        // Below 50 the electric engine is assigned to be the active engine
        if(this.speed<=50){
            this.gasEngineInHypred.setSpeed(0);
            this.electricEngineInHyprid.setSpeed(this.speed);
            this.activeEngine=electricEngineInHyprid;

        }

        // above 50 the gas engine is assigned to the be the active engine
        else{
            this.gasEngineInHypred.setSpeed(this.speed);
            this.electricEngineInHyprid.setSpeed(0);
            this.activeEngine=gasEngineInHypred;
        }
    }

    @Override
    public void setSpeed(int newSpeed) {
        this.speed=newSpeed;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }
    public EngineType getEngineType(){
        return EngineType.HYBRID;
    }
}
