package ru.andreev.homework.homework5.SchoolPack;

import java.util.Objects;

public class Director {
    private String name;
    private int age;

    public Director(String name, int age) {
        if (age<30 || age > 75)
            throw new IllegalArgumentException("wrong age");
        this.name = Objects.requireNonNull(name,"wrong name");
        this.age = age;
    }
    public void startsEducation(){
        System.out.println("Education starts...");
    }
    public void endsEducation(){
        System.out.println("Education ends...");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
