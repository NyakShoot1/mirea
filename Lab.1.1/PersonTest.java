package com.company;

import java.lang.String;

public class PersonTest
{
    public static void main(String[] args) throws Exception {

        Person person1 = new Person();

        person1.setName("Roman");
        person1.setAge(19);
        person1.setHeight(1.8f);

        System.out.println(person1.getAge());
        System.out.println(person1.getName());
        System.out.println(person1.getHeight());

        person1.info();

        person1.setAge(201);

        person1.info();
    }
}
