package fawry.car.engines;

public interface Engine {
    void decrease();
    void increase();
    void setSpeed(int newSpeed);
    public int getSpeed();
    static enum EngineType {
        GAS, ELECTRIC, HYBRID
    }
    public EngineType getEngineType();
}
