package com.basic.a07_classloader;

public class Student {

    private String name;
    public int age;

    public Student() {
    }

    private Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private void show() {
        System.out.println(this.toString());
    }

    public int returnTest(int num) {
        return num * num;
    }

}
