package com.company;

public class Person
{
    private final int MAX_AGE = 200;
    private final double MAX_HEIGHT = 3;

    private int age;
    private float height;
    private String name;
    private boolean isNameValid = false;
    private boolean isAgeValid = false;
    private boolean isHeightValid = false;

    Person(){}

    public void setAge(int age) {
        this.age = age;

        isAgeValid = true;
    }

    public void setName(String name) {
        this.name = name;

        isNameValid = true;
    }

    public void setHeight(float height) {
        this.height = height;

        isHeightValid = true;
    }

    public String getName() { return name; }

    public int getAge() { return age; }

    public float getHeight() { return height; }

    public void info() {
        if(isValid())
            System.out.println(this.toString());
        else
            System.out.println("Object has an incorrect value");
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", height=" + height +
                ", name='" + name + '\'' + '}';
    }

    public boolean isValid() { return isAgeValid && isHeightValid && isNameValid; }
}
