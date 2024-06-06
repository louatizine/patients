package com.hospital.patients.model;

public class Patient {
    private String name ;
    private int age ;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Patient() {
    }

    public Patient(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
