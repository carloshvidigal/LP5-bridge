package bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TruckTest {

    @Test
    void shouldReturnTruckWithBasicInsurancePlan() {
        InsurancePlan insurancePlan = new BasicPlan();
        Truck truck = new Truck(800000.0f);
        truck.setInsurancePlan(insurancePlan);
        assertEquals(56000.0f, truck.generateInsuranceCost());
    }

    @Test
    void shouldReturnTruckWithGoldInsurancePlan() {
        InsurancePlan insurancePlan = new GoldPlan();
        Truck truck = new Truck(800000.0f);
        truck.setInsurancePlan(insurancePlan);
        assertEquals(89600.0f, truck.generateInsuranceCost());
    }

    @Test
    void shouldReturnTruckWithPlatinumInsurancePlan() {
        InsurancePlan insurancePlan = new PlatinumPlan();
        Truck truck = new Truck(800000.0f);
        truck.setInsurancePlan(insurancePlan);
        assertEquals(123200.0f, truck.generateInsuranceCost());
    }
}
