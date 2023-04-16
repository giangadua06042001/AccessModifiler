package com.Codegym;

public class Car {
    private String name;
    private int engine;
    private static int number;

    public Car() {
    }

    public Car(String name, int engine) {
        this.name = name;
        this.engine = engine;
        number++;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine=" + engine +
                '}';
    }

    public static void main(String[] args) {
        Car car=new Car("Honda",450);
        System.out.println(Car.number);
        Car car1=new Car("mercedes",450);
        System.out.println(Car.number);
    }


}
