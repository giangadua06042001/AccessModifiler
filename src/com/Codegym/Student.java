package com.Codegym;

public class Student {
    private int rollno;
    private String name;
    private static String college="BBDIT";

    public Student(int r,String n) {
        this.rollno=r;
        this.name=n;
    }
    public static void change(){
        college="CODEGYM";
    }
    public void display(){
        System.out.println(rollno+" "+name+" "+college);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student.change();
        Student student=new Student(111,"Hoang");
        Student student1=new Student(222,"khanh");
        Student student2=new Student(333,"Nam");
        student2.display();
        student1.display();
        student.display();
    }
}
