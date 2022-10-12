package ru.andreev.homework.homework5.SchoolPack;

import java.util.Objects;

public class SchoolBuilding {
    String title;
    Director director;
    Pupil[] pupils = new Pupil[20];
    Teacher[] teachers = new Teacher[5];
    int countPupils =0;
    int countTeachers = 0;


    public SchoolBuilding(String title, Director director) {
        this.title = title;
        this.director = director;

    }
    public void addTeacher(Teacher teacher){
        if (countTeachers<5) {
            teachers[countTeachers] = teacher;
            countTeachers++;
            return;
        }
        System.out.println("Teachers squad is full");
    }

    public void addPupil(Pupil pupil){
        if (countPupils<20) {
            pupils[countPupils] = pupil;
            countPupils++;
            return;
        }
        System.out.println("Pupils squad is full");
    }

    public void teaching(Teacher [] teacher, Pupil[] pupil) {
        director.startsEducation();
        for (int i = 0; i <teacher.length ; i++) {
            if (Objects.nonNull(teacher[i])) {
                for (int j = 0; j < pupil.length; j++) {
                    if (Objects.nonNull(pupil[j]))
                    teacher[i].teach(pupil[j]);
                }
            }
        }
        director.endsEducation();
    }
}
