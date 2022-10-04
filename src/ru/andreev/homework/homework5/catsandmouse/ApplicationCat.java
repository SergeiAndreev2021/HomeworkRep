package ru.andreev.homework.homework5.catsandmouse;

public class ApplicationCat {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Bars",10,8,70);
        Cat cat2 = new Cat("Bob",11,6,40);

        Mouse mouse1 = new Mouse(8);

        cat1.catVersusCat(cat2);

        System.out.println(cat1.getMouseCaptchured());
        System.out.println(cat2.getMouseCaptchured());

        cat2.catchMouse(mouse1);
        System.out.println(cat2.getMouseCaptchured());
    }
}
