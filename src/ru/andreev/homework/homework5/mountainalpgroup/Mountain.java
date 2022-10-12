package ru.andreev.homework.homework5.mountainalpgroup;
// предполагается что название горыб а также её параметры неизменны
public class Mountain {
    private String name;
    private String country;
    private int altitude;

    public Mountain(String name, String country, int altitude) {
        if (country==null || name == null || name.length() < 4 || country.length() < 4 || altitude < 100 )
            throw new IllegalArgumentException("Неверно введены данные");

        this.name = name;
        this.country = country;
        this.altitude = altitude;
    }



    @Override
    public String toString() {
        return "Mountain{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", altitude=" + altitude +
                '}';
    }
}