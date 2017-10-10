package realEstate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
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
    void getDetailsPrintDetails() throws IOException {
        File diskFile = new File("data");
        System.out.println("File should be in " + diskFile.getCanonicalPath());
        Scanner file = new Scanner(diskFile);
        testEstate.getDetailsPrintDetails(file);
        String expectedAddress = "Krakowska 13";
        int expectedMeters = 283;
        short expectedNumberOfBedrooms = 2;
        assertEquals(expectedMeters, testEstate.getAreaInSqrMeters());
        assertEquals(expectedAddress, testEstate.getAddress());
        assertEquals(expectedNumberOfBedrooms, testEstate.getNumberOfBedrooms());
        file.close();
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