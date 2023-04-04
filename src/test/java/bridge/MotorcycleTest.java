package bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotorcycleTest {

    @Test
    void shouldReturnMotorcycleWithBasicInsurancePlan() {
        InsurancePlan insurancePlan = new BasicPlan();
        MotorCycle motorCycle = new MotorCycle(30000.0f);
        motorCycle.setInsurancePlan(insurancePlan);
        assertEquals(1500.0f, motorCycle.generateInsuranceCost());
    }

    @Test
    void shouldReturnMotorcycleWithGoldInsurancePlan() {
        InsurancePlan insurancePlan = new GoldPlan();
        MotorCycle motorCycle = new MotorCycle(30000.0f);
        motorCycle.setInsurancePlan(insurancePlan);
        assertEquals(2400.0f, motorCycle.generateInsuranceCost());
    }

    @Test
    void shouldReturnMotorcycleWithPlatinumInsurancePlan() {
        InsurancePlan insurancePlan = new PlatinumPlan();
        MotorCycle motorCycle = new MotorCycle(30000.0f);
        motorCycle.setInsurancePlan(insurancePlan);
        assertEquals(3300.0f, motorCycle.generateInsuranceCost());
    }

}
