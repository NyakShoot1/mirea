package com.company;

public class EmployeeTest {
    public static void main(String[] args) {

        var employee1 = new Employee("Ivan", "Shop", Employee.Position.SELLER);

        System.out.println(employee1);

        System.out.println(employee1.think());
    }
}
