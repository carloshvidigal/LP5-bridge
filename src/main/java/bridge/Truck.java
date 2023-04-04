package bridge;

public class Truck extends Vehicle{

    public Truck(float baseCost) {
        super(baseCost);
    }

    public float generateInsuranceCost() {
        return (float) (2.8)*(this.vehicleCost * (this.insurancePlan.getInsurancePercentage()));
    }
}
