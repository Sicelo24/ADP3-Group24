package za.ac.cput.project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class FishTest {
    Fish fish1;
    Fish fish2;
    Fish fish3;
    @BeforeEach
    void setUp() {
        fish1 = new Fish("Dolhpin");
        fish2 = new Fish("Dolphin");
        fish3 = fish2;
    }

    @Test
    void getFish() {
        //Testing for object equality
        //This test will pass
        assertEquals(fish1, fish1);
    }

    @Test
    void testIdentity(){
        //Testing Object Identity
        //Test passed Object Identity
        assertSame(fish2, fish3);
    }
    @Test
    void failingTest(){
        //This will fail the test on purpose
        fail("Failed");
    }

    @Test
    @Disabled
    void disabledTest(){
        // This test will be disabled
        assertEquals(fish1.getFishType(), fish2.getFishType());
    }

    @Test
    void timeoutTest(){
        //Displays an error message when time has reached its limit
        assertTimeout(Duration.ofMillis(10), () -> {
            Thread.sleep(500);
            System.out.println("Time limit exceeded");
        });
    }

}