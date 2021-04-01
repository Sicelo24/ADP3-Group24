/**
 * WolfTest Class
 * author: Athenkosi Zono 218030185
 **/
package za.ac.cput.project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class WolfTest {

    Wolf wolfR, wolfB, wolfG, wolfZ;

    @BeforeEach
    void setUp() {
        wolfR = new Wolf("Reddie", "Red", 4.91);
        wolfB = new Wolf("Darkie", "Black", 27.1);
        wolfG = new Wolf("Jackie", "Green", 10.2);
        wolfZ = wolfR;
    }

    @Test
    void testEquality(){
        //This test will Pass - object equality - wolfR.beautyLevel() == wolfZ.beautyLevel()
        assertEquals(wolfR.beautyLevel(), wolfZ.beautyLevel());
    }

    @Test
    void testIdentity(){
        //This test will Pass - object identity - wolfR is the same as wolfZ
        assertSame(wolfR, wolfZ);
    }

    @Test
    void testFailing(){
        //This test will fail as intended
        fail("Failed That's what i wanted!!");
        //Will not reach the following code as intended
        System.out.println("Region of Specie: " + wolfG.getSpeciesRegion());
    }

    @Test
    @Disabled
    void disabledTest(){
        // This test will be disabled
        assertEquals(wolfG.beautyLevel(), wolfZ.beautyLevel());
    }

    @Test
    void timeoutTest(){
        // The time will expire the text will never be printed
        assertTimeout(Duration.ofMillis(100), () -> {
            Thread.sleep(5000);
            System.out.println("Tried to get Here!!! but failed");
        });
    }


}
