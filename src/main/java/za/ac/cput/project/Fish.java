//*
//Name:Sicelo
//Surname:Zitha
//Student Number:216140943
//Date:1 April 2021
//*
package za.ac.cput.project;
import java.util.Objects;

public class Fish {
    private String fishType;
    private double fishLength;

    public Fish() {

    }

    public Fish(String fishType, double fishLength) {
        this.fishType = fishType;
        this.fishLength = fishLength;
    }

    public Fish(String name) {
    }

    public String getFishType() {
        return fishType;
    }

    public void setFishType(String fishType) {
        this.fishType = fishType;
    }

    public double getFishLength() {
        return fishLength;
    }

    public void setFishLength(double fishLength) {
        this.fishLength = fishLength;
    }

    public String fishSize(double fishLength) {
        if (fishLength < 7.5) return "Small Fish";
        else if (fishLength < 14.7) return "Medium Fish";
        else if (fishLength <= 28.8) return "Large Fish";
        else return "Can't be sized";
    }
}
