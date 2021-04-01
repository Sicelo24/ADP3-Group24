package za.ac.cput.project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DivisionTest {
    private Division objDivisionUnderTest;

    @BeforeEach
    public void setUp() {

        objDivisionUnderTest = new Division();
    }


    @Test //Generate an error
    void div1() throws Exception {
        int num1 = 20;
        int num2 = 2;
        assertSame(num1, num2);
    }

    @Test
    void div2() {
        int num1 = 25;
        int num2 = 5;
        int expectedResult = 5;
        long result = objDivisionUnderTest.div2(num1, num2);
        assertEquals(expectedResult, result);
    }

    @Test
    void div3() {
        int num1 = 10;
        int num2 = 10;
        long expectedResult = 1;
        long result = objDivisionUnderTest.div3(num1, num2);
        assertEquals(expectedResult, result);

    }

    @Test //(timeout = 500 )
    void div() throws Exception {
        Thread.sleep(1000);
        System.out.println("TimeOut");

    }

    @Disabled

    @Test //(expected = IllegalArgumentException.class)
    public void testDiv4ByZero() {
        int num1 = 10;
        int num2 = 0;
        objDivisionUnderTest.div4(num1, num2);

    }

}