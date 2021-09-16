package com.company;

public class PersonExTest {
    public static void main(String[] args) throws IllegalNameException, IllegalAssignmentException {

        PersonEx personEx1 = new PersonEx();

        personEx1.setName("Roman");
        personEx1.setAge(19);
        personEx1.setHeight(1.8f);
        personEx1.setGender(PersonEx.Gender.MALE);

        System.out.println(personEx1.getAge());
        System.out.println(personEx1.getName());
        System.out.println(personEx1.getHeight());

        personEx1.info();

        //personEx1.setAge(201);
        //personEx1.setHeight(20f);
        personEx1.setName("");

        personEx1.info();
    }
}
