package bridge;

public abstract class Vehicle {

    protected InsurancePlan insurancePlan;

    protected float baseCost;

    public Vehicle(float baseCost) {
        this.baseCost = baseCost;
    }

    public void setInsurancePlan(InsurancePlan insurancePlan) {
        this.insurancePlan = insurancePlan;
    }

    public void setBaseCost(float baseCost) {
        this.baseCost = baseCost;
    }

    public abstract float generateInsuranceCost();

}
