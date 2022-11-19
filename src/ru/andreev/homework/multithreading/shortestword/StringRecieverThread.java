package ru.andreev.homework.multithreading.shortestword;

import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class StringRecieverThread extends Thread {
     CopyOnWriteArrayList<String> strings;

    public StringRecieverThread (CopyOnWriteArrayList<String> strings) {
        this.strings = strings;
    }

    @Override
    public void run() {

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println(" Enter your word");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop"))
                break;
           strings.add(input);
        }
    }
}
