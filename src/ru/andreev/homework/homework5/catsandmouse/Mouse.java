package ru.andreev.homework.homework5.catsandmouse;

public class Mouse {
   private int speed;
   private String name;
   private String[] names = {"Buba","Biba","Giga","Gaga","Zoro","Pomo","Dudu","Didi","Lola","Lula"};
    Mouse(){}
    Mouse(String name, int speed)
    {
        this.name = name;
        this.speed=speed;

    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public  Mouse getMouse(){

        String mName = names[(int)(Math.random()*names.length)];
        return new Mouse(mName,(int)(Math.random()*13)+3);
    }

    public Mouse[] getBanchOfMice(int a){
        System.out.println("В избушку забежало "+a+"мышей :");
        Mouse [] temp = new Mouse[a];
        for (int i = 0; i <a ; i++) {
            temp[i] = getMouse();
            System.out.print(temp[i]+" ");
        }
        return temp;
    }
    @Override
    public String toString() {
        return name +" speed : "+speed+".";
    }
}
