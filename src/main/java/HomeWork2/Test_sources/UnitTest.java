package HomeWork2.Test_sources;

import HomeWork2.Car;
import HomeWork2.Motorcycle;
import HomeWork2.Vehicle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UnitTest {

    @Test
    void testCarIsInstanceOfVehicle() {
        Car car = new Car("Toyota", "Camry", 2021);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testCarCreation() {
        Car car = new Car("Company", "Model", 2022);
        assertEquals(4, car.getNumWheels(), "Car should be created with 4 wheels");
    }

    @Test
    public void testNumWheels() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2022);
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    public void testCarSpeed() {
        Car car = new Car("Company", "Model", 2022);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    public void testMotorcycleSpeedDuringTestDrive() {
        Motorcycle motorcycle = new Motorcycle("Company", "Model", 2021);
        motorcycle.testDrive();
        int expectedSpeed = 75;
        int actualSpeed = motorcycle.getSpeed();
        assertEquals(expectedSpeed, actualSpeed);
    }

    @Test
    public void testPark() {
        Car car = new Car("Toyota", "Camry", 2021);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    public void testParkMode() {
        Motorcycle motorcycle = new Motorcycle("Company", "Model", 2022);
        motorcycle.testDrive();
        motorcycle.park();
        int expectedSpeed = 0;
        int actualSpeed = motorcycle.getSpeed();
        assertEquals(expectedSpeed, actualSpeed);
    }
}
