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
         int [] codeCount = {0,0,0,0,0,0,0,0,0,0};
        for (Message m : list) {
            if (m.getCode() == 0) codeCount[0]++;
            if (m.getCode() == 1) codeCount[1]++;
            if (m.getCode() == 2) codeCount[2]++;
            if (m.getCode() == 3) codeCount[3]++;
            if (m.getCode() == 4) codeCount[4]++;
            if (m.getCode() == 5) codeCount[5]++;
            if (m.getCode() == 6) codeCount[6]++;
            if (m.getCode() == 7) codeCount[7]++;
            if (m.getCode() == 8) codeCount[8]++;
            if (m.getCode() == 9) codeCount[9]++;
        }
        for (int i = 0; i <codeCount.length ; i++) {
            if (codeCount[i]>0)
            System.out.println(" Код "+ i+ " встречается "+ codeCount[i] + " раз");
        }
    }




    public static void uniqueMessage(List<Message> list){
        HashSet<Message> set = new HashSet<>();
        //  set = Collection.adAll(list); ??
        for (Message m : list) {
            set.add(m);
        }
        System.out.println(" Количество уникальных сообщений в списке " + set.size());
    }

    public static void uniqueMessageInOriginalOrder(List<Message> list){
        LinkedHashSet<Message> set = new LinkedHashSet<>();
        //  set = Collection.adAll(list); ??
        for (Message m : list) {
            set.add(m);
        }
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
