package ru.andreev.homework.multithreading.shortestword;

import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class StringRecieverThread extends Thread {

    @Override
    public void run() {
        //CopyOnWriteArrayList<String> strings = new CopyOnWriteArrayList<>();
       // CommonCollection collection = new CommonCollection();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println(" Enter your word");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop"))
                break;
            CommonCollection.strings.add(input);
        }
    }
}
