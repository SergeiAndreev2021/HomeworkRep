package ru.andreev.homework.homeworkCollection.message;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class MessageTask {

    public static void countEachPriority(List<Message> list){
        int pLowCount =0;
        int pMediunCount =0;
        int pHighCount =0;
        int pUrgentCount =0;
        for (Message m : list) {
            if( m.getPriority().equals(MessagePriority.LOW)) pLowCount++;
            if( m.getPriority().equals(MessagePriority.MEDIUM)) pMediunCount++;
            if( m.getPriority().equals(MessagePriority.HIGH)) pHighCount++;
            if( m.getPriority().equals(MessagePriority.URGENT)) pUrgentCount++;

        }

        System.out.println(" Количество сообщений с минимальным приоритетом "+pLowCount);
        System.out.println(" Количество сообщений со средним приоритетом "+pMediunCount);
        System.out.println(" Количество сообщений с высоким приоритетом "+pHighCount);
        System.out.println(" Количество сообщений с неотложным приоритетом "+pUrgentCount);
    }

    public static void countEachCode(List<Message> list) {
         int [] codeCount = new int[10];
        for (Message m : list) {
           codeCount[m.getCode()]++;
        }
        for (int i = 0; i <codeCount.length ; i++) {
            if (codeCount[i]>0)
            System.out.println(" Код "+ i+ " встречается "+ codeCount[i] + " раз");
        }
    }




    public static void uniqueMessage(List<Message> list){
        /*
        HashSet<Message> set = new HashSet<>();
        //  set = Collection.adAll(list); ??
        for (Message m : list) {
            set.add(m);
        }
        System.out.println(" Количество уникальных сообщений в списке " + set.size());

         */
        System.out.println(new HashSet<>(list).size());
    }

    public static void uniqueMessageInOriginalOrder(List<Message> list){
        LinkedHashSet<Message> set = new LinkedHashSet<>(list);
        System.out.println(set.toString());
    }
    public static void removeEach(List<Message> messageList, MessagePriority priority) {
        System.out.println(" list before remove : " );
        System.out.println(messageList.toString());
        Iterator<Message> iterator = messageList.iterator();
        while (iterator.hasNext()){
            if (iterator.next().getPriority() == priority)
                iterator.remove();
        }
        System.out.println(" list after remove : " );
        System.out.println(messageList.toString());
    }

    public static void removeOther(List<Message> messageList, MessagePriority priority) {
        System.out.println(" list before remove : " );
        System.out.println(messageList.toString());
        Iterator<Message> iterator = messageList.iterator();
        while (iterator.hasNext()){
            if (iterator.next().getPriority() != priority)
                iterator.remove();
        }
        System.out.println(" list after remove : " );
        System.out.println(messageList.toString());
    }
}
