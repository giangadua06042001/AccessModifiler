package com.Codegym;

public class Student1 {
    private String name="jonh";
    private String classes="C02";

    public Student1() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student1 student1=new Student1();
        Student1 student11=new Student1();
        student11.setClasses("C0223");
        student11.setName("Dua");
        System.out.println(student11);
        System.out.println(student1);
    }
}
