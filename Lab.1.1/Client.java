package com.company;

public class Client extends AbstractPerson {

    private String service;
    private float price;

    Client(String name) {
        super(name);
    }

    Client(String name, String service, float price){
        super(name);
        this.service = service;
        this.price = price;
    }

    @Override
    public String think() {
        return "I'm a client";
    }

    @Override
    public String toString() {
        return "Client{" +
                "name=" + this.name +
                ", service='" + service + '\'' +
                ", price=" + price +
                '}';
    }
}
