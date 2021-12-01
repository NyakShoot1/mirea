package ru.mirea;

public class MovableCircle implements Movable
{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public String toString()
    {
        return "Circle (" + center.x + ", " + center.y + "), radius = " + radius;
    }

    @Override
    public Movable clone()
    {
        return new MovableCircle(this.center.x, this.center.y,this.center.xSpeed,this.center.ySpeed,this.radius);
    }

    @Override
    public void moveUp()
    {
        center.moveUp();
    }

    @Override
    public void moveDown()
    {
        center.moveDown();
    }

    @Override
    public void moveRight()
    {
        center.moveRight();
    }

    @Override
    public void moveLeft()
    {
        center.moveLeft();
    }
}
