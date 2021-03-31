package za.ac.cput.project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WolfTest {

    Wolf wolfR, wolfB, wolfG;

    @BeforeEach
    void setUp() {
        wolfR = new Wolf("Reddie", "Red", 4.91);
        wolfB = new Wolf("Darkie", "Black", 27.1);
        wolfG = new Wolf("Jackie", "Green", 10.2);
    }

    @Test
    void testEquality(){
        assertEquals(wolfR, wolfG);
    }


}
