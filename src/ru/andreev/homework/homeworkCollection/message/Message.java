package ru.andreev.homework.homeworkCollection.message;

import java.util.*;

public class Message {
    private  int code;
    private  MessagePriority priority;

    public Message(int code, MessagePriority priority) {
        this.code = code;
        this.priority = priority;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public MessagePriority getPriority() {
        return priority;
    }

    public void setPriority(MessagePriority priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        if (code != message.code) return false;
        return priority == message.priority;
    }

    @Override
    public int hashCode() {
        return Objects.hash(priority);
    }

    @Override
    public String toString() {
        return "Message{" +
                "code=" + code +
                ", priority=" + priority +
                '}';
    }

    public static List<Message> generate(int num) {
        if (num <= 0)
            return Collections.emptyList();
        Random random = new Random();
        List<Message> messages = new ArrayList<>(num);
        int typesCount = MessagePriority.values().length;

        for (int i = 0; i < num; i++) {
            messages.add(new Message(random.nextInt(10), MessagePriority.getPriority(random.nextInt(typesCount))));
        }
        return messages;
    }
}
