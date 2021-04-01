package za.ac.cput.project;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    //equality
    @Test
    void testDog() {
        Dog dog1= new Dog("pitbull",43);
        Dog dog2= new Dog("pitbull",43);
        assertEquals(dog1,dog2);
    }
    //identity
    @Test
    void testGetHeight(){
        Dog dog1= new Dog("pitbull",43);
        Dog dog2= new Dog("pitbull",43);
        Dog dog3= dog1;
        assertSame(dog1,dog3);
    }
    //failing
    @Test
    void failingDog(){
        Dog dog1= new Dog("pitbull",43);
        Dog dog2= new Dog("German shepard",43);
        assertEquals(dog1,dog2);
    }
    //failing by checking if the objects are not equal
    void failDog(){
        Dog dog1= new Dog("pitbull",43);
        Dog dog2= new Dog("German shepard",43);
        assertNotEquals(dog1,dog2);
    }
    //timeout
    @Test
    void timeoutDog(){
        assertTimeout(Duration.ofSeconds(1),()->{
            Dog dog1= new Dog("pitbull",43);
            Dog dog2= new Dog("pitbull",43);
            Dog dog3= dog1;
            assertSame(dog1,dog3);
        });
    }
    //disabling test
    @Disabled("disabling dog test")
    @Test
    void DisableDogTest(){
        Dog dog1= new Dog("pitbull",43);
        Dog dog2= new Dog("German shepard",43);
        assertNotEquals(dog1,dog2);
    }
}