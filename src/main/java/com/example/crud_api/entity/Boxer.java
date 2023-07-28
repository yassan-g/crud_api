package com.example.crud_api.entity;

public class Boxer {

    private int id;
    private String name;
    private int age;
    private String gymName;

    public Boxer(int id, String name, int age, String gymName) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gymName = gymName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGymName() {
        return gymName;
    }
}
