package com.company;

public class ClientTest {
    public static void main(String[] args) {

        var client1 = new Client("Petrovich","КрасноеБелое",10f);

        System.out.println(client1.think());

        System.out.println(client1);
    }
}
