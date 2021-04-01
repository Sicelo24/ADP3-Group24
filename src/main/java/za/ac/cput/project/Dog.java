package za.ac.cput.project;

/* 217290671 - Tashreeq Williams */

import java.util.Objects;

public class Dog {

    private String breed;
    private int height;

    public Dog(String breed, int height){
        this.setBreed(breed);
        this.setHeight(height);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return height == dog.height && Objects.equals(breed, dog.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed, height);
    }
}
