package ru.andreev.homework.homework5.SchoolPack;

import java.util.Arrays;

public class AppSchool {
    public static void main(String[] args) {
        Pupil p1 = new Pupil("Igor","maths",12,6);
        Pupil p2 = new Pupil("Vaso","maths",10,7);
        Pupil p3 = new Pupil("Pevec","english",8,4);
        Pupil p4 = new Pupil("Roman","English",9,4);
        Pupil p5 = new Pupil("Pavel","French",7,8);
        Pupil p6 = new Pupil("Bob","french",10,3);

        Teacher t1 = new Teacher("Egor Ivanich", "maths",36,4);
        Teacher t2 = new Teacher("Eduard Nikandrich", "french",70,5);
        Teacher t3 = new Teacher("Ivan Savellich", "maths",40,5);

        Director director1 = new Director("Samuil",67);

        SchoolBuilding school = new SchoolBuilding("DayTime school", director1);
        school.addPupil(p1);
        school.addPupil(p2);
        school.addPupil(p3);
        school.addPupil(p4);
        school.addPupil(p5);
        school.addPupil(p6);

        school.addTeacher(t1);
        school.addTeacher(t2);
        school.addTeacher(t3);

      for( Pupil pupil :school.pupils){
          if (pupil!=null)
              System.out.println(pupil);
      }

        for( Teacher teacher :school.teachers){
            if (teacher!=null)
                System.out.println(teacher);
        }
        school.teaching(school.teachers, school.pupils);


        for( Pupil pupil :school.pupils){
            if (pupil!=null)
                System.out.println(pupil);
        }
    }
}
