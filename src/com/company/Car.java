package com.company;

public class Car implements AutoCloseable{
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void close() throws Exception {
        System.out.println( name+" is closing.");
    }
    public void drive(){
        System.out.println(name+" is driving");
    }
}
