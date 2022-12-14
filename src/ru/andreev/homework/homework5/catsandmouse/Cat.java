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
        if ( name == null || name.length() < 3 || speed < 1 || weight < 1)
            throw new IllegalArgumentException("wrong data input");
        this.name = name;
        this.speed = speed;
        this.weight = weight;

    }

    public void catchBunch(Mouse[] mice){
        for (int i = 0; i <mice.length ; i++) {
            this.catchMouse(mice[i]);
        }
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

        if (this.weight > cat1.weight) {

            for (int i = 0, j=0; i < this.packOfMouses.length; i++) {
                    if (this.packOfMouses[i] != null) continue;
                        this.packOfMouses[i] = cat1.packOfMouses[j];
                        j++;
                if (cat1.packOfMouses[j]==null) break;
            }
            for (int k = 0; k < this.packOfMouses.length; k++ ){
                if (packOfMouses[k]!=null){
                    if (packOfMouses[k].getSpeed()>this.speed){
                        System.out.println("Мышка "+packOfMouses[k].getName()+" убежала");
                        packOfMouses[k]=null;
                    }
                }
            }
            cat1.packOfMouses = new Mouse[100];
            int countmice =0;
            for (Mouse m : this.packOfMouses) {
                if (m!=null)
                    countmice++;
            }
            System.out.println(this.name + "  победил и отобрал у "+cat1.name+" мышей");
            System.out.println("Количество его мышей : "+countmice);

            for (Mouse m : this.packOfMouses) {
                if (m!=null)
                    System.out.print(m+ " | ");
            }
            System.out.println(cat1.name + "  остался без мышей");
        } else {

            for (int i = 0, j=0; i < cat1.packOfMouses.length; i++ ) {
                if (cat1.packOfMouses[i] != null) continue;
                cat1.packOfMouses[i] = this.packOfMouses[j];
                    j++;
                    if (this.packOfMouses[j]==null) break;
            }
            for (int k = 0; k < cat1.packOfMouses.length; k++ ){
                if (packOfMouses[k]!=null){
                    if (packOfMouses[k].getSpeed()>cat1.speed){
                        System.out.println("Мышка "+packOfMouses[k].getName()+" убежала");
                        packOfMouses[k]=null;
                    }
                }
            }
            this.packOfMouses = new Mouse[100];
            int countmice=0;
            for (Mouse m : cat1.packOfMouses) {
                if (m!=null)
                  countmice++;
            }
            System.out.println(cat1.name + "  победил и отобрал у "+this.name+" мышей");
            System.out.println("Количество его мышей : "+countmice);
            for (Mouse m : cat1.packOfMouses) {
                if (m!=null)
                System.out.print(m+ " | ");
            }
            System.out.println();
            System.out.println(this.name + "  остался без мышей");
        }
    }
}