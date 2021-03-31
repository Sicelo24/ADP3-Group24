package za.ac.cput.project;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class horseTest {
 // Testing the equality
    @Test
    void testHorse() {
       horse horse1= new horse("stalion",54);
       horse horse2= new horse("stalion",54);
       assertEquals(horse1,horse2);
    }

//Testing the Identity
    @Test
    void testGetSpeed() {
    horse horse1= new horse("stalion",54);
    horse horse2= new horse("stalion",54);
    horse horse3= horse1;
    assertSame(horse1,horse3);
}
//Failing Test
    @Test
    void failingHorseTest(){
        horse horse1= new horse("stalion",54);
        horse horse2= new horse("mustang",54);
        assertEquals(horse1,horse2);
    }
//Failing Test by checking if the objects are not equal using assertNOtEquals
    @Test
    void failingTest(){
        horse horse1= new horse("stalion",54);
        horse horse2= new horse("mustang",54);
        assertNotEquals(horse1,horse2);
    }
//Testing the speed of the code execution using the the timeout
    @Test
    void testTimeoutHorse(){
    assertTimeout(Duration.ofSeconds(2),()->{
        horse horse1= new horse("stalion",54);
        horse horse2= new horse("stalion",54);
        assertEquals(horse1,horse2);
    });
    }
//disabling the horse test should it be for a future functionality that has not been added yet
    @Disabled("disbaled horse test")
    @Test
    void testDisabledHorse(){
        horse horse1= new horse("stalion",54);
        horse horse2= new horse("stalion",54);
        assertEquals(horse1,horse2);
    }
}