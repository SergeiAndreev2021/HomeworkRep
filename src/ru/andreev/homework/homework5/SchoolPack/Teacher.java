package ru.andreev.homework.homework5.SchoolPack;

import java.util.Objects;

public class Teacher extends SchoolUnit {

    String subject;
    int age;
    int skillTeacher;

    public Teacher(String name, String subject, int age, int skillTeacher) {
        super(name);
        this.subject = Objects.requireNonNull(subject,"wrong subject");
        if (age<20 || age > 80 || skillTeacher<0 || skillTeacher>10)
            throw new IllegalArgumentException("wrong data about age or skill");
        this.age = age;
        this.skillTeacher = skillTeacher;
    }
    public void teach(Pupil pupil){
        if (this.subject.equalsIgnoreCase(pupil.getSubject()))
        pupil.study(Teacher.this);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", age=" + age +
                ", skillTeacher=" + skillTeacher +
                '}';
    }
}
