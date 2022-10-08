package ru.andreev.homework.homework5.catsandmouse;

import org.w3c.dom.ls.LSOutput;

public class ApplicationCat {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Bars",(int)(Math.random()*11)+1,(int)(Math.random()*20)+5);
        Cat cat2 = new Cat("Semen",(int)(Math.random()*11)+1,(int)(Math.random()*20)+5);

        Mouse m = new Mouse();
        Mouse[] tribe= m.getBanchOfMice((int) (Math.random()*15)+1);
        System.out.println(cat1.getName() +"  начал охоту ");
        cat1.catchBunch(tribe);
        cat1.printMiceCaptured();

        Mouse m1 = new Mouse();
        Mouse[] tribe1= m1.getBanchOfMice((int) (Math.random()*15)+1);
        System.out.println(cat2.getName() +"  начал охоту ");
        cat2.catchBunch(tribe1);
        cat2.printMiceCaptured();

        System.out.println("Кажется "+cat1.getName()+"  и  "+cat2.getName()+" затеяли схватку между собой!");
        cat1.catVersusCat(cat2);
    }
}
