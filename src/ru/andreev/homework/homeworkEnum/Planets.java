package ru.andreev.homework.homeworkEnum;

import java.util.Objects;

public enum Planets {
    NEPTUNE("Нептун", 100_000_000_000_000_000L,24000) ,
    MARS("Марс",6_000_000,3400),
    JUPITER("Юпитер",1_900_000_000_000_000_000L,67000);
    private  String name;
    private long weightInBillionOfTons;
    private int radiusInKm;

    Planets(String name, long weightInBillionOfTons, int radiusInKm) {
        if( name == null || name.length()<3 || weightInBillionOfTons<0 || radiusInKm<0 )
            throw new IllegalArgumentException("wrong data");
        this.name = name;
        this.weightInBillionOfTons = weightInBillionOfTons;
        this.radiusInKm = radiusInKm;
    }

    public void setRadiusInKm(int radiusInKm) {
        this.radiusInKm = radiusInKm;
    }

    public void setWeightInBillionOfTons(long weightInBillionOfTons) {
        this.weightInBillionOfTons = weightInBillionOfTons;
    }

    @Override
    public String toString() {
        return "Название плвнеты  '" + name + '\'' +
                ". Вес в миллиардах тонн :" + weightInBillionOfTons +
                ". Радиус планеты в километрах " + radiusInKm +
                '}';
    }
}
