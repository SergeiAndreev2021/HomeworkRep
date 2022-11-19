package ru.andreev.homework.multithreading.shortestword;

public class Application {
    public static void main(String[] args) {
      StringRecieverThread reciever = new StringRecieverThread();
      ShortStringFinder finder = new ShortStringFinder();

      reciever.start();
      finder.start();
        // ждем пока закончатся манипуляции с коллекцией
        try {
            reciever.join(30000);
            finder.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Выводим коллекцию без первой строчки
        System.out.println(CommonCollection.strings);
    }
}
