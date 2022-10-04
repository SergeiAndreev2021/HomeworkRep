package ru.andreev.homework.homework5.productsallowed;

public class Product {
    private String name;
    private int belok;
    private int fat;
    private int uglevod;

    public Product(String name, int belok, int fat, int uglevod) {
        this.name = name;
        this.belok = belok;
        this.fat = fat;
        this.uglevod = uglevod;
    }

    public Product(String name, int belok, int fat) {
        this.name = name;
        this.belok = belok;
        this.fat = fat;
    }

    public Product(String name, int belok) {
        this.name = name;
        this.belok = belok;
    }


    public Product(String name) {
        this.name = name;
    }
}
