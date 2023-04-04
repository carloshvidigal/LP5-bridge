package bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test
    void shouldReturnCarWithBasicInsurancePlan() {
        InsurancePlan insurancePlan = new BasicPlan();
        Car car = new Car(50000.0f);
        car.setInsurancePlan(insurancePlan);
        assertEquals(1250.0f, car.generateInsuranceCost());
    }

    @Test
    void shouldReturnCarWithGoldInsurancePlan() {
        InsurancePlan insurancePlan = new GoldPlan();
        Car car = new Car(50000.0f);
        car.setInsurancePlan(insurancePlan);
        assertEquals(2000.0f, car.generateInsuranceCost());
    }

    @Test
    void shouldReturnCarWithPlatinumInsurancePlan() {
        InsurancePlan insurancePlan = new PlatinumPlan();
        Car car = new Car(50000.0f);
        car.setInsurancePlan(insurancePlan);
        assertEquals(2750.0f, car.generateInsuranceCost());
    }
}
