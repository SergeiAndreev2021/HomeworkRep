package ru.andreev.homework.multithreading.shortestword;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

public class ShortStringFinder extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //CopyOnWriteArrayList<String> strings = new CopyOnWriteArrayList<>();
        String shortest = CommonCollection.strings.stream().min((x,y)-> x.length()-y.length()).orElse("Error");

        File file = new File("shortString.txt");
        try(FileOutputStream fos = new FileOutputStream(file))
        {
            fos.write(shortest.getBytes());
        }  catch (IOException e) {
            e.printStackTrace();
        }

        CommonCollection.strings.remove(0);
    }
}
