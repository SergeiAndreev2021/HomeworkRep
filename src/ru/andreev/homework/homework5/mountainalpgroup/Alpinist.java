package ru.andreev.homework.homework5.mountainalpgroup;

public class Alpinist {
    private String name;
    private String address;


    Alpinist(String name, String address){
        if ( name == null || address == null ||name.length() < 3 || address.length() < 5)
            throw new IllegalArgumentException("Ошибка данных");
        this.name = name;
        this.address = address;
    }



    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Alpinist{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
