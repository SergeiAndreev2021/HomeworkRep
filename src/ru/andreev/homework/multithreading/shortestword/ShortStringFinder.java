package ru.andreev.homework.multithreading.shortestword;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

public class ShortStringFinder extends Thread{

    CopyOnWriteArrayList<String> strings;

    public ShortStringFinder (CopyOnWriteArrayList<String> strings) {
        this.strings = strings;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         if (strings.isEmpty()) {
             System.out.println(" no elements in collection");
             return;
         }
        String shortest = strings.stream().min((x,y)-> x.length()-y.length()).orElse("Error");

        File file = new File("shortString.txt");
        try(FileOutputStream fos = new FileOutputStream(file))
        {
            fos.write(shortest.getBytes());
        }  catch (IOException e) {
            e.printStackTrace();
        }

       strings.remove(shortest);
    }
}
