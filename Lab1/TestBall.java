package ru.mirea.lab1;
import java.lang.*;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball();
        Ball b2 = new Ball(13f);
        Ball b3 = new Ball(11.2f, "Volleyball");

        b2.setKindOfSport("Water polo");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
