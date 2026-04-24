package fawry.car.engines;

public class GasEngine implements Engine{
    private int speed;
    public void setSpeed(int newSpeed){
        this.speed=newSpeed;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    public GasEngine() {

    }

    @Override
    public void increase() {
        this.speed+=1;
        System.out.println("increasing Gas Engine speed now its speed = "+this.speed);
    }



    @Override
    public void decrease() {
        this.speed--;
        System.out.println("decreasing Gas Engine speed now its speed = "+this.speed);

    }
    public EngineType getEngineType(){
        return EngineType.GAS;
    }
}
