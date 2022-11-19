package ru.andreev.homework.multithreading.shortestword;

import java.util.concurrent.CopyOnWriteArrayList;

public class Application {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> strings = new CopyOnWriteArrayList<>();
        StringRecieverThread reciever = new StringRecieverThread(strings);
        ShortStringFinder finder = new ShortStringFinder(strings);

      reciever.start();
      finder.start();
        // ждем пока закончатся манипуляции с коллекцией
        try {
            reciever.join(30_000);
            finder.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Выводим коллекцию без первой строчки
        if (!strings.isEmpty())
            System.out.println(strings);
    }
}
