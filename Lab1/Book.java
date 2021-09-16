package ru.mirea.lab1;
import java.lang.*;

public class Book {

    private int pages;
    private String genre;

    Book(){
        pages = 250;
        genre = "Classic literature";
    }

    Book(int p){
        pages = p;
        genre = "Fantastic";
    }

    Book(int p, String g){
        pages = p;
        genre = g;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPages() {
        return pages;
    }

    public String getGenre() {
        return genre;
    }

    public String toString() {
        return "Genre: "+this.genre+", number of pages: "+this.pages;
    }
}
