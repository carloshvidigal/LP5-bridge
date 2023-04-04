package bridge;

public class Car extends Vehicle{

    public Car(float baseCost) {
        super(baseCost);
    }

    public float generateInsuranceCost() {
        return this.vehicleCost * (this.insurancePlan.getInsurancePercentage());
    }
}
