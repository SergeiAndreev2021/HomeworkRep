package ru.andreev.homework.homework5.SchoolPack;

import java.util.Objects;

public class SchoolUnit {
    String name;

    public SchoolUnit(String name) {

        this.name = Objects.requireNonNull(name,"wrong name");

    }
}
