package realEstate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstateTest {

    Estate testEstate;
    @BeforeEach
    void setUp() {
        testEstate = new Estate();
        testEstate.setAreaInSqrMeters(50);
        short val = 4;
        testEstate.setNumberOfBedrooms(val);
    }

    @Test
    void costPerSquareMeter() {
        int expected = 25000;
        int actual = testEstate.costPerSquareMeter(500);
        assertEquals(expected, actual);
    }

    @Test
    void costPerBedroom() {
        int expected = 28000;
        int actual = testEstate.costPerBedroom(7000);
        assertEquals(expected, actual);
    }

}