package ru.andreev.homework.homework5.catsandmouse;

public class Mouse {
   private int speed;
   private String name;


    Mouse(String name, int speed)
    {
        this.speed=speed;
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "speed=" + speed +
                ", name='" + name + '\'' +
                '}';
    }
}
