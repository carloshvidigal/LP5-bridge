package bridge;

public class MotorCycle extends Vehicle{

    public MotorCycle(float baseCost) {
        super(baseCost);
    }

    public float generateInsuranceCost() {

        return 2*(this.vehicleCost * (this.insurancePlan.getInsurancePercentage()));
    }

}
