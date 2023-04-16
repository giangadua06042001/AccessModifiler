package com.Codegym;

public class Circle {
    private double radius=1.0;
    private String color="read";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        double Area=this.radius*this.radius*3.14;
        return Area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Circle circle= new Circle(3.14,"blue");
        Circle circle1=new Circle();
        System.out.println(circle1.getArea());
        System.out.println(circle.getArea());
        System.out.println(circle);
        System.out.println(circle1);
    }

}
