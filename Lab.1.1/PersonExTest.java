package com.company;

public class PersonExTest {
    public static void main(String[] args) throws IllegalNameException, IllegalAssignmentException {

        PersonEx personEx = new PersonEx();
        personEx.setName("Roman");
        personEx.setAge(19);
        personEx.setHeight(1.8f);
        personEx.setGender(PersonEx.Gender.MALE);
        personEx.info();
    }
}
