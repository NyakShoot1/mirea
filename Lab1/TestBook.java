package ru.mirea.lab1;
import java.lang.*;

public class TestBook {
    public static void main(String[] args){
        Book b1 = new Book();
        Book b2 = new Book(139);
        Book b3 = new Book(399, "Fantasy");

        b1.setGenre("Children's literature");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
