package ru.andreev.homework.homework5.catsandmouse;

import org.w3c.dom.ls.LSOutput;

public class ApplicationCat {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Bars",(int)(Math.random()*10)+1,(int)(Math.random()*20)+5);
        Cat cat2 = new Cat("Semen",(int)(Math.random()*10)+1,(int)(Math.random()*20)+5);
        Cat cat3 = new Cat("Oleg",(int)(Math.random()*10)+1,(int)(Math.random()*20)+5);

        Mouse mouse1 = new Mouse("Goga",(int)(Math.random()*13)+1);
        Mouse mouse2 = new Mouse("Giga",(int)(Math.random()*13)+1);
        Mouse mouse3 = new Mouse("Rusta",(int)(Math.random()*13)+1);
        Mouse mouse4 = new Mouse("Pusto",(int)(Math.random()*13)+1);
        Mouse mouse5 = new Mouse("Bobka",(int)(Math.random()*13)+1);
        Mouse mouse6 = new Mouse("Zhuzha",(int)(Math.random()*13)+1);

        System.out.println(cat1.getName() +"  начал охоту ");
        cat1.catchMouse(mouse1);
        cat1.catchMouse(mouse2);
        cat1.catchMouse(mouse3);
        cat1.printMiceCaptured();

        System.out.println(cat2.getName() +"  начал охоту ");
        cat2.catchMouse(mouse4);
        cat2.catchMouse(mouse5);
        cat2.catchMouse(mouse6);
        cat2.printMiceCaptured();

        System.out.println("Кажется "+cat1.getName()+"  и  "+cat2.getName()+" затеяли схватку между собой!");
        cat1.catVersusCat(cat2);

    }
}
