package ru.andreev.homework.homework5.productsallowed;

public class Product {
    private String name;
    private int belok;
    private int fat;
    private int uglevod;
    private  int calories;

    //  в конструктор закладываем проверку на то что введенные данные положительны
    public Product(String name, int belok, int fat, int uglevod,int calories) {
        if ( name.length()<3 || belok<0 || fat<0 || uglevod <0 || calories<0)
            throw  new IllegalArgumentException("U have entered wrong data");
        this.name = name;
        this.belok = belok;
        this.fat = fat;
        this.uglevod = uglevod;
        this.calories = calories;
    }

    public Product(String name, int belok, int fat) {
        if ( name.length()<3 || belok<0 || fat<0)
            throw  new IllegalArgumentException("U have entered wrong data");
        this.name = name;
        this.belok = belok;
        this.fat = fat;
    }

    public Product(String name, int belok) {
        if ( name.length()<3 || belok<0)
            throw new IllegalArgumentException("U have entered wrong data");

        this.name = name;
        this.belok = belok;
    }


    public Product(String name) {
        if ( name.length()<3)
            throw new IllegalArgumentException("U have entered wrong data");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getBelok() {
        return belok;
    }

    public int getFat() {
        return fat;
    }

    public int getUglevod() {
        return uglevod;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String  toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", belok=" + belok +
                ", fat=" + fat +
                ", uglevod=" + uglevod +
                ", calories=" + calories +
                '}';
    }
}
