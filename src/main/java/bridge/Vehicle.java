package bridge;

public abstract class Vehicle {

    protected InsurancePlan insurancePlan;

    protected float vehicleCost;

    public Vehicle(float baseCost) {
        this.vehicleCost = baseCost;
    }

    public void setInsurancePlan(InsurancePlan insurancePlan) {
        this.insurancePlan = insurancePlan;
    }

    public void setVehicleCost(float vehicleCost) {
        this.vehicleCost = vehicleCost;
    }

    public abstract float generateInsuranceCost();

}
