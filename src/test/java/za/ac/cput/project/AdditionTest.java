package za.ac.cput.project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {



    int firstNum = 12;
    int  secondNum = 110;
    int expectedSum = 122;
    int thirdNum = secondNum;
    int sum = firstNum + secondNum;



    @BeforeEach
    void setUp() {

        Addition myAddition = new Addition();
    }

    @Test
    //Testing object equality
    //Test passed Object Equality
    void objectEquality(){

        assertEquals(firstNum, firstNum);
    }

    @Test
    //Testing Object Identity
    //Test passed Object Identity
    void testIdentity(){
        assertSame(thirdNum, secondNum);

    }

    @Test
    void failingTest(){
        //Failing test on purpose
        fail("Failed");
    }



    @Test
    @Disabled("Disabling the test")
    void disablingTest(){
        //Disabling the test

        assertSame(thirdNum, secondNum);


    }

    @Test
    void timeoutExceededTest()
    {
     //Displaying an error message when time has reached
        assertTimeout(ofMillis(10), () -> {

            Thread.sleep(100);
           System.out.println("Timeout Exceeded");
        });





    }}