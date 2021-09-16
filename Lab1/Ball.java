package ru.mirea.lab1;
import java.lang.*;

public class Ball {

    private float diameter;
    private String kindOfSport;

    Ball(){
        diameter = 12.5f;
        kindOfSport = "football";
    }

    Ball(float d){
        diameter = d;
        kindOfSport = "football";
    }

    Ball(float d, String sport){
        diameter = d;
        kindOfSport = sport;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    public void setKindOfSport(String kindOfSport) {
        this.kindOfSport = kindOfSport;
    }

    public float getDiameter() {
        return diameter;
    }

    public String getKindOfSport() {
        return kindOfSport;
    }

    public String toString() {
        return "Diameter = "+this.diameter+", kind of sport: "+this.kindOfSport;
    }
}
