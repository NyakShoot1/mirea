package ru.mirea;

public interface Movable {
    void moveUp ();
    void moveDown ();
    void moveLeft ();
    void moveRight ();
    public abstract Movable clone();
}
