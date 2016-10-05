package se.hiq.kodarskolan;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import se.hiq.kodarskolan.Car;

public class CarTest {

    private Car car;

    @Test
    public void testFillPetrol() {
        car = new Car(100.0);
        car.fillPetrol(20.0);
        assertFalse(car.tankIsFull());
        car.fillPetrol(100.0);
        assertTrue(car.tankIsFull());
        // can't fill negative amount
        car = new Car(100.0);
        try {
            car.fillPetrol(-1.0);
            //shouldn't get here
            fail("IllegalArgumentException not thrown");
        } catch (IllegalArgumentException e) {
        }
        // can't fill more than capacity
        car = new Car(100.0);
        try {
            car.fillPetrol(101.0);
            //shouldn't get here
            fail("IllegalArgumentException not thrown");
        } catch (IllegalArgumentException e) {
        }
    }
}
