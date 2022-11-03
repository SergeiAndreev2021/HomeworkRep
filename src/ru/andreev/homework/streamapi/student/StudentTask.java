package ru.andreev.homework.streamapi.student;
import org.w3c.dom.ls.LSOutput;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class StudentTask {
    //1
    public static Map<Student.Gender, ArrayList<Student>> genderer(List<Student> list) {
        return list.stream().collect(Collectors.groupingBy(el -> el.getGender(), Collectors.toCollection(ArrayList::new)));
    }
    //2

    public static double averAge(List <Student> list) {
        return list.stream().mapToInt(x-> (int)(Math.abs(ChronoUnit.YEARS.between(LocalDate.now(),x.getBirth()))))
                    .average().orElse(0.0);
    }

    //3
    public static Student younger(List <Student> list){
       return list.stream().max((el1,el2) -> {
                                if (el1.getBirth().isBefore(el2.getBirth())) return -1;
                                else  if (el1.getBirth().isEqual(el2.getBirth())) return 0;
                                else return 1;
       }).get();

    }
    //4
    public static Student older(List <Student> list){
        return list.stream().min(((el1,el2) -> {
            if (el1.getBirth().isBefore(el2.getBirth())) return -1;
            else  if (el1.getBirth().isEqual(el2.getBirth())) return 0;
            else return 1;
        })).get();

    }
    //5
    public static Map<Integer, List<Student>> birthGroups(List<Student> list) {
        return list.stream().collect(Collectors.groupingBy(el-> el.getBirth().getYear()));
    }
    //6
    public static void uniqueNames(List<Student> list){
     Collection<Student> coll = list.stream().collect(Collectors.toMap(
                    Student::getName,         // key
                    Function.identity(), // value
                    (el1, el2) -> el1
      )).values();
      coll.stream().forEach( el-> System.out.println(el.getName()+" "+el.getBirth()));
    }
    //7
    public static List<Student> sorted(List<Student> list){
        Comparator <Student> sexSort = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGender().toString().compareTo(o2.getGender().toString());
            }
        };
        Comparator <Student> ageSort = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getBirth().isBefore(o2.getBirth())) return -1;
                else  if (o1.getBirth().isEqual(o2.getBirth())) return 0;
                else return 1;
            }
        };
        Comparator <Student> ageName = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getName().compareTo(o1.getName());
            }
        };
       return list.stream().sorted(sexSort.thenComparing(ageSort).thenComparing(ageName)).collect(Collectors.toList());
    }
    //8
    public static void printRequestedAge(List<Student>list,int fromIncluded,int toExcluded) {
        if (toExcluded<fromIncluded)
            throw new IllegalArgumentException(" check your entered data");
        list.stream().filter(el->LocalDate.now().getYear()-el.getBirth().getYear()>=fromIncluded
                     && LocalDate.now().getYear()-el.getBirth().getYear()<toExcluded)
                     .forEach(System.out::println);
    }

    //9
    public static List<Student> namesToList(List <Student> list, String name ){
       return list.stream().filter(x-> x.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
    }

    //10
    public static  Map<Student.Gender, Integer> getAgeSumMap (List<Student> list) {
        Map<Student.Gender, List<Student>> map = list.stream()
                .collect(Collectors.groupingBy(el -> el.getGender()));

        return null;
    }
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student(1, "Женя", Student.Gender.MALE, LocalDate.now().minusYears(10)),
                new Student(2, "Олег", Student.Gender.MALE, LocalDate.now().minusYears(7)),
                new Student(3, "Алена", Student.Gender.FEMALE, LocalDate.now().minusYears(6)),
                new Student(4, "Иван", Student.Gender.MALE, LocalDate.now().minusYears(12)),
                new Student(5, "Алексей", Student.Gender.MALE, LocalDate.now().minusYears(9)),
                new Student(6, "Петр", Student.Gender.MALE, LocalDate.now().minusYears(9)),
                new Student(7, "Иван", Student.Gender.MALE, LocalDate.now().minusYears(17)),
                new Student(8, "Петр", Student.Gender.MALE, LocalDate.now().minusYears(5)),
                new Student(9, "Алена", Student.Gender.FEMALE, LocalDate.now().minusYears(8)),
                new Student(10, "Алена", Student.Gender.FEMALE, LocalDate.now().minusYears(10)),
                new Student(11, "Григорий", Student.Gender.MALE, LocalDate.now().minusYears(7)),
                new Student(12, "Ирина", Student.Gender.FEMALE, LocalDate.now().minusYears(6))
        ));

        // TODO: Используя Stream API:
        //  1. Разделить учеников на две группы: мальчиков и девочек. Результат: Map<Student.Gender, ArrayList<Student>>
        //  2. Найти средний возраст учеников
        //  3. Найти самого младшего ученика
        //  4. Найти самого старшего ученика
        //  5. Собрать учеников в группы по году рождения
        //  6. Убрать учеников с одинаковыми именами ? (непонятно оставить уникальные имена или оставить тоько тех кто по 1 разу вс
        //  тречается), имена и дату рождения оставшихся вывести в консоль
        //  7. Отсортировать по полу, потом по дате рождения, потом по имени (в обратном порядке), собрать в список (List)
        //  8. Вывести в консоль всех учеников в возрасте от N до M лет
        //  9. Собрать в список всех учеников с именем=someName
        //  10. Собрать Map<Student.Gender, Integer>, где Student.Gender - пол, Integer - суммарный возраст учеников данного пола
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(genderer(students));
        System.out.println(df.format(averAge(students)));
        System.out.println(younger(students));
        System.out.println(older(students));
        System.out.println(birthGroups(students));
        System.out.println(sorted(students));
        printRequestedAge(students,6,8);
        System.out.println(namesToList(students,"петр"));

    }
}
