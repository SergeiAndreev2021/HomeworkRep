package ru.andreev.homework.homework5.mountainalpgroup;
import java.util.Arrays;
public class ApplicationMountain {
    public static void main(String[] args) {
        Mountain mountain1 = new Mountain("Everest1","Russia", 2000);
        Mountain mountain2 = new Mountain("Everest2","Russia", 1000);
        Mountain mountain3 = new Mountain("Pamir","Uzbekistan", 2500);

       ClimbingGroup group1 = new ClimbingGroup();
       group1.addAlpinist(new Alpinist("Ivan","Laplandia"));
       group1.addAlpinist(new Alpinist("Egor","Moscow"));
       group1.addAlpinist(new Alpinist("Petr","Peterburg"));
        group1.addAlpinist(new Alpinist("Petor","Peterburgos"));
        System.out.println("Group squad is : ");

        System.out.println(Arrays.toString(group1.getAlpList()));
        group1.setMountain(mountain1);

        System.out.println(group1.getMountain());

        ClimbingGroup group2 = new ClimbingGroup();
        group2.addAlpinist(new Alpinist("Sasha","Erevan"));
        group2.addAlpinist(new Alpinist("Misha","Saratov"));
        group2.setMountain(mountain2);
        System.out.println("Group squad is : ");

        System.out.println(Arrays.toString(group2.getAlpList()));
        System.out.println(group2.getMountain());

        ClimbingGroup group3 = new ClimbingGroup();
        group3.addAlpinist(new Alpinist("Sabina","Tambov"));
        group3.addAlpinist(new Alpinist("Mira","Samara"));
        group3.setMountain(mountain3);
        System.out.println("Group squad is : ");

        System.out.println(Arrays.toString(group3.getAlpList()));
        System.out.println(group2.getMountain());
    }
}
