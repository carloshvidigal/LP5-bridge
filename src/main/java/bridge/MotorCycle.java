package bridge;

public class MotorCycle extends Vehicle{

    public MotorCycle(float baseCost) {
        super(baseCost);
    }

    public float generateInsuranceCost() {
        return this.baseCost;
    }

}
