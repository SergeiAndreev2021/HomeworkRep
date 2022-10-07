package ru.andreev.homework.homework5.catsandmouse;

import org.w3c.dom.ls.LSOutput;

public class Cat {
    private String name;
    private int speed;
    private int weight;
    private int mouseCaptchured = 0;
    private Mouse[] packOfMouses = new Mouse[100];


    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public int getMouseCaptchured() {
        return mouseCaptchured;
    }

    public Cat(String name, int speed, int weight) {
        if (name.length() < 3 || speed < 1 || weight < 1)
            throw new IllegalArgumentException("wrong data input");
        this.name = name;
        this.speed = speed;
        this.weight = weight;

    }

    public void catchMouse(Mouse mouse) {
        if (mouseCaptchured == 100) {
            System.out.println("Больше негде складывать мышей");
            return;
        }
        if (this.speed > mouse.getSpeed()) {
            packOfMouses[mouseCaptchured] = mouse;
            mouseCaptchured++;
            System.out.println("поймал мышку  по имени  " + mouse.getName());
            return;
        }
        System.out.println("Мышка " + mouse.getName() + " убежала!!!");
    }

    public void printMiceCaptured() {
        if (mouseCaptchured == 0) {
            System.out.println("У кота " + this.name + " нет пойманных мышей");
            return;
        }
        System.out.println("У кота " + this.name + " -  " + mouseCaptchured + " пойманных мышей : ");
        for (Mouse m : packOfMouses) {
            if (m != null)
                System.out.println(m);
        }
    }

    public void catVersusCat(Cat cat1) {
        if (this.mouseCaptchured == 0 && cat1.mouseCaptchured == 0) {
            System.out.println("У котов нет мышей, поэтому они согласились на ничью");
            return;
        }
        if (this.weight == cat1.weight) {
            System.out.println("Коты в одной весовой категории, они согласны на ничью.");
            return;
        }
        //  очищаем массивы от  null

        int count = 0;
        for (Mouse packOfMouse : this.packOfMouses) {
            if (packOfMouse != null)
                count++;
        }
        Mouse[] temp1 = new Mouse[count];
        for (int i = 0; i < this.packOfMouses.length; i++) {
            if (this.packOfMouses[i] != null)
                temp1[i] = this.packOfMouses[i];
        }
        int count1 = 0;
        for (Mouse packOfMouse1 : cat1.packOfMouses) {
            if (packOfMouse1 != null)
                count1++;
        }

        Mouse[] temp2 = new Mouse[count1];
        for (int i = 0; i < cat1.packOfMouses.length; i++) {
            if (cat1.packOfMouses[i] != null)
                temp2[i] = cat1.packOfMouses[i];
        }

        Mouse[] result = new Mouse[temp1.length + temp2.length];
        System.arraycopy(temp1, 0, result, 0, temp1.length);
        System.arraycopy(temp2, 0, result, temp1.length, temp2.length);
        if (this.weight > cat1.weight) {
            this.packOfMouses = result;
            cat1.packOfMouses = new Mouse[100];
            System.out.println(this.name + "  победил, у него теперь " + result.length + " мышей");
            for (Mouse m : result) {
                System.out.println(m);
            }
            System.out.println(cat1.name + "  остался без мышей");

        } else {
            cat1.packOfMouses = result;
            this.packOfMouses = new Mouse[100];
            System.out.println(cat1.name + "  победил, у него теперь " + result.length + " мышей");

            for (Mouse m : result) {
                System.out.println(m);

            }
            System.out.println(this.name + "  остался без мышей");

        }
    }
}