package ru.mirea;

public class Main {
    public static void main(String[] args)
    {
        MovablePoint point = new MovablePoint(0, 0, 2, 2);

        MovablePoint pointCopy = (MovablePoint) point.clone();
        pointCopy.moveDown();

        System.out.println("Старая точка: " + point);
        System.out.println("Копия точки:" + pointCopy);

        MovableCircle circle = new MovableCircle(0, 0, 3, 3, 8);

        MovableCircle circleCopy = (MovableCircle) circle.clone();
        circleCopy.moveRight();

        System.out.println("Старый круг: " + circle);
        System.out.println("Копия круга: " + circleCopy);
    }
}
