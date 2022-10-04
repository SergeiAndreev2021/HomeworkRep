package ru.andreev.homework.homework5.catsandmouse;

public class Cat {
    private String name;
   private int speed;
   private  int weight;
   private int mouseCaptchured;


    public int getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public int getMouseCaptchured() {
        return mouseCaptchured;
    }

    public Cat(String name, int speed, int weight, int mouseCaptchured) {
        if (mouseCaptchured>100) this.mouseCaptchured =100;

        this.name = name;
        this.speed = speed;
        this.weight = weight;
        this.mouseCaptchured = mouseCaptchured;
    }
    public void catchMouse(Mouse mouse){
        if (this.speed>mouse.getSpeed())
            this.mouseCaptchured++;

    }

    public void catVersusCat(Cat cat1){
        if (this.weight>cat1.weight) {
            this.mouseCaptchured += cat1.mouseCaptchured;
            cat1.mouseCaptchured = 0;
            if (this.mouseCaptchured >= 100)
                this.mouseCaptchured = 100;
        }
        else {
            cat1.mouseCaptchured += this.mouseCaptchured;
            this.mouseCaptchured =0;
            if (cat1.mouseCaptchured >= 100)
                cat1.mouseCaptchured = 100;

        }
    }
}
