package ru.andreev.homework.homeworkCollection.message;

import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class Application {
    public static void main(String[] args) {
       List<Message> list = Message.generate(10);

        System.out.println(list.toString());

        MessageTask.countEachPriority(list);

        MessageTask.uniqueMessage(list);
        MessageTask.uniqueMessageInOriginalOrder(list);

        List<Message> list2 = Message.generate(10);

        MessageTask.removeEach(list,MessagePriority.URGENT);
        MessageTask.removeOther(list2,MessagePriority.URGENT);
        System.out.println("****************************************");
        List<Message> list3 = Message.generate(10);
        System.out.println(list3.toString());
        MessageTask.countEachCode(list3);

    }

}
