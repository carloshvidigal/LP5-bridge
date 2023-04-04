package bridge;

public class Truck extends Vehicle{

    public Truck(float baseCost) {
        super(baseCost);
    }

    public float generateInsuranceCost() {
        return this.baseCost;
    }
}
