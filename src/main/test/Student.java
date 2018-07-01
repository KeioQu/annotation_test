package main.test;

import main.annotation.Access;

public class Student {
    String name;

    //学生年龄在18岁以上才允许
    @Access(value = 18)
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
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
}
