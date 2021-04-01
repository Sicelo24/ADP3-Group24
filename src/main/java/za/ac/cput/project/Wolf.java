/**
 * Wolf Class
 * author: Athenkosi Zono 218030185
 **/
package za.ac.cput.project;

public class Wolf {
    private String breed, color;
    private double height;

    public Wolf(String breed, String color, double height) {
        this.breed = breed;
        this.color = color;
        this.height = height;
    }

    public String getSpeciesRegion(){
        if (breed.isEmpty()) return "No data";
        switch(breed){
            case "Reddie":
                return "From Red Mountains of Cocuses";
            case "Blackie":
                return "From Dark Mountains of CPUT";
            case "Pinkie":
                return "From Pink Mountains of Sub-Sahara";
            default: return "Not Known";
        }
    }

    public int beautyLevel(){
        if (color.isEmpty()) return 0;
        switch(color){
            case "Red":
                return 3;
            case "Black":
                return 6;
            case "Pink":
                return 10;
            default: return 1;
        }
    }

    public String dangerLevel(double height){
        if (height < 5.5) return "Still a wolfie";
        else if (height < 10) return "Don't make eye contact";
        else if (height <= 15.3) return "Hunter";
        else return "Hunter Killer run";
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
