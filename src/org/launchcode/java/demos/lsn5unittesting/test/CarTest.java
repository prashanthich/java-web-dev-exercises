package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.*;

public class CarTest {

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    //TODO: constructor sets gasTankLevel properly
    //TODO: gasTankLevel is accurate after driving within tank range
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    //TODO: can't have more gas than tank size, expect an exception

    Car test_car;

    @Before
    public void createCarObject() {
        test_car = new Car("Toyota", "Prius", 10, 50);
    }

    @Test
    public void emptyTest() {
        int results = 10;
        assertEquals(10, results, .001);
    }

    @Test
    public void testInitialGasTank() {
        //Arrange

        assertEquals(10, test_car.getGasTankLevel(), .001);
    }

    @Test
    public void testGasTankAfterDriving() {
        //Arrange
        double miles = 50;
        double expectedTankLevel = 9;

        //Act
        test_car.drive(miles);

        //Assert
        assertEquals(expectedTankLevel, test_car.getGasTankLevel(), .01);
        assertTrue(test_car.getGasTankLevel() == 9);
    }

    @Test
    public void testGasTankAfterExceedingTankRange() {
        //Arrange
        double miles = 560;
        double expectedTankLevel = 0;

        //Act
        test_car.drive(miles);

        //Assert
        assertEquals(expectedTankLevel, test_car.getGasTankLevel(), .001);
        assertEquals(500, test_car.getOdometer(), .001);
        assertFalse(miles == test_car.getOdometer());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGasOverfillException() {
        //Arrange
        //Act
        test_car.addGas(5);
        //Assert
        fail("Shouldn't get here, car cannot have more gas in tank than the size of the tank");
    }


}
