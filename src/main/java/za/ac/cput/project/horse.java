//*
//Name:Avuyile
//Surname:Xozumthi
//Student Number:218331827
//Date:31 March 2021
//*
package za.ac.cput.project;
import java.util.Objects;

public class horse {

    private String breed;
    private int speed;

    public horse(String breed, int speed){
        this.setBreed(breed);
        this.setSpeed(speed);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        horse horse = (horse) o;
        return speed == horse.speed && Objects.equals(breed, horse.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed, speed);
    }
}
