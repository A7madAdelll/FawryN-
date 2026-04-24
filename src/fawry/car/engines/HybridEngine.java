package fawry.car.engines;

public class HybridEngine implements Engine{
    private int speed;
    private ElectricEngine electricEngineInHypred;
    private GasEngine gasEngineInHypred;
    private Engine activeEngine;
    public HybridEngine() {
        this.electricEngineInHypred = new ElectricEngine();
        this.gasEngineInHypred = new GasEngine();
        this.activeEngine=electricEngineInHypred;
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
        if(this.speed<=50){
            this.gasEngineInHypred.setSpeed(0);
            this.electricEngineInHypred.setSpeed(this.speed);
            this.activeEngine=electricEngineInHypred;

        }
        else{
            this.gasEngineInHypred.setSpeed(this.speed);
            this.electricEngineInHypred.setSpeed(0);
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
