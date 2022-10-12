package ru.andreev.homework.homework5.SchoolPack;

import java.util.Objects;

public class Pupil extends SchoolUnit {

    private String subject;
    private int age;
    private int levelKnowledge;

    public Pupil(String name, String subject, int age, int levelKnowledge){
         super(name);
        if (age<6 || age >18 || levelKnowledge<2 || levelKnowledge>10)
            throw new IllegalArgumentException("wrong data");
        this.subject = Objects.requireNonNull(subject,"wrong subject");
        this.age = age;
        this.levelKnowledge = levelKnowledge;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public int getAge() {
        return age;
    }

    public int getLevelKnowledge() {
        return levelKnowledge;
    }
    public void setLevelKnowledge(int plus) {
        this.levelKnowledge=plus;
    }

    public void study(Teacher teacher){
        if (subject.equalsIgnoreCase(teacher.subject))
        this.levelKnowledge = this.levelKnowledge + (int)(Math.random()*teacher.skillTeacher);

    }

    @Override
    public String toString() {
        return "Pupil{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", age=" + age +
                ", levelKnowledge=" + levelKnowledge +
                '}';
    }
}
