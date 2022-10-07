package ru.andreev.homework.homework5.productsallowed;

public class ApplicProduct {
    public static void main(String[] args) {
        Product prod1 = new Product("Iriski");
        Product prod2 = new Product("Fish",35);
        Product prod3 = new Product("Meat",40,50);
        Product prod4 = new Product("Grocery",80,60,71,400);

        MyProducts mp1 = new MyProducts(40,31,75,500);

        mp1.addProduct(prod4);
        mp1.addProduct(prod3);
        mp1.addProduct(prod1);
        mp1.addProduct(prod2);
        mp1.printProdList();

        mp1.setMaxBelki(90);
        mp1.setMaxFat(90);
        mp1.addProduct(prod4);
        mp1.addProduct(prod3);

        mp1.printProdList();


    }
}
