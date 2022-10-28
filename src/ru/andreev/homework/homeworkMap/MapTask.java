package ru.andreev.homework.homeworkMap;

import java.util.*;

public class MapTask {
    // 1. 
    public static List<String> logList(HashMap<String, String> hmap, String city) {
        List<String> logList = new ArrayList<>();
        for (Map.Entry<String, String> pair : hmap.entrySet()) {
            if (pair.getValue().equals(city))
                logList.add(pair.getKey());
        }
        return logList;
    }

    //2.
    public static HashMap<String, Integer> countEncounters(List<String> list) {
        HashMap<String, Integer> hmap = new HashMap<>();
        for (String s : list) {
            if (hmap.containsKey(s))
                hmap.put(s, hmap.get(s) + 1);
            else
                hmap.put(s, 1);
        }
        return hmap;
    }

    //3.
    public static HashMap<String, Customer> customerMaper(HashMap<String, Customer> map, int from, int to) {
        HashMap<String, Customer> customerBetween = new HashMap<>();
        for (Map.Entry<String, Customer> pair : map.entrySet()) {
            if (pair.getValue().getAge() >= from && pair.getValue().getAge() < to)
                customerBetween.put(pair.getKey(), pair.getValue());
        }

        return customerBetween;
    }

    //4.
    public static HashMap<String, Long> counter(String text, String word) {
        HashMap<String, Long> map = new HashMap<>();
        String[] words = text.split(" ");
        long count = 0;
        for (String s : words) {
            if (word.equals(s)) count++;
        }
        map.put(word, count);
        return map;
    }

    //5.
    public static HashMap<Integer, ArrayList<String>> countLengthEncounters(String text) {
        HashMap<Integer, ArrayList<String>> map = new HashMap<>();
        String[] words = text.split(" ");
        //  с помощью отсортированного множества получаем уникальные ключи (длины слов) для итоговой мапы
        //  и распологаем их в порядке возрастания
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < words.length; i++) {
            set.add(words[i].length());
        }
        // Создаем ArrayList на основе полученного выше множества  для того чобы можно было работать с элементами и
        // формируем  мапу с ключами-элементами ArrayList и пустыми значениями
        ArrayList<Integer> arr = new ArrayList<>(set);
        for (int i = 0; i < arr.size(); i++) {
            map.put(arr.get(i), new ArrayList<String>());
        }
        // заполняем значения. Количество букв в значении соответствует ключам мапы
        for (int i = 0; i < words.length; i++) {
            map.get(words[i].length()).add(words[i]);
        }
        return map;
    }
     //6
    public static void encounterchart(String text) {
        text = text.toLowerCase();
        String[] words = text.split(" ");
        // Создаем изначальную мапу значений
        Map<String, Integer> map = new HashMap<>();
        for (String s : words) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else map.put(s, 1);
        }
        // Создаем  Лист типа узел Ключ + значение,  ( сам не догадался гуголь помог) на основе нашей мапы
        // И сортируем его по убыванию с помощью кампаратора
        List<Map.Entry<String, Integer>> list33 = new ArrayList<>(map.entrySet());
        Collections.sort(list33, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        // добавляем в новый массив отсортированные по значению ключи
        ArrayList<String> aList = new ArrayList<>();
        for (var pair : list33) {
            aList.add(pair.getKey());
        }
        // первые 10 штук выводим на экран
        for (int i = 0; i < 10; i++) {
            System.out.print(aList.get(i) + " ");
        }
    }



    public static void main(String[] args) {

        HashMap<String, String> firstTaskMap = new HashMap<>();
        firstTaskMap.put("one", "Тверь");
        firstTaskMap.put("two", "Тверь");
        firstTaskMap.put("three", "Москва");
        firstTaskMap.put("four", "Тверь");
        firstTaskMap.put("five", "Магадан");

        String city = "Тверь";
        System.out.println(logList(firstTaskMap, city));
        // TODO:: дан список слов (words).
        //  Написать статический метод, который будет возвращать количество одинаковых слов
        //  в мапе вида Map<String, Integer>, где String - слово и Integer - количество повторений

        List<String> words = new ArrayList<>();
        words.add("may");
        words.add("august");
        words.add("june");
        words.add("may");
        words.add("may");
        words.add("july");
        words.add("may");
        words.add("august");
        words.add("august");

        System.out.println(countEncounters(words));

        // TODO:: дана мапа (customerMap).
        //  Написать статический метод, который принимает на вход аргументы int from и int to и возвращает
        //  новую мапу, в которую войдут все покупатели, возраст которых находится в диапазоне [from, to)

        HashMap<String, Customer> customerMap = new HashMap<>();
        customerMap.put("1", new Customer("Павел", "1", 23));
        customerMap.put("2", new Customer("Олег", "2", 17));
        customerMap.put("3", new Customer("Максим", "3", 48));
        customerMap.put("4", new Customer("Евгения", "4", 67));

        System.out.println(customerMaper(customerMap, 20, 65));


        // TODO:: Задания по тексту (text). На каждый пункт - минимум один метод (можно статический):
        //  1. написать метод, принимающий на вход слово и возвращающий частоту встречаемости данного слова в тексте
        //  (Map<String, Long>, где - ключи (String) - слово, значения (Long) - частота встречаемости)
        //  2. написать метод, который собирает все слова в группы по количеству букв:
        //  например, в одну группу попадут слова: 3 - [the, war, jar, get, met...], в другую 2 - [on, up, no, of...]
        //  (Map<Integer, ArrayList<String>>, где - ключи (Integer) - количество букв, значения (ArrayList<String>) - слова)
        //  3. написать метод, который выводит в консоль топ 10 самых часто встречаемых в тексте слов (артикли и предлоги тоже считаем за слова)

        // в тексте содержатся только буквы и пробельные символы
        String text = "It is a uncover long established fact that a reader will be distracted uncover by the readable content of a page " +
                "when looking at its layout The point of using uncover Lorem Ipsum is that sites it has a more-or-less normal distribution of letters" +
                "as uncover opposed to still using Content here humour uncover content here making it look like readable English Many desktop publishing " +
                "packages and web page editors now use Lorem Ipsum as their default model text and a search for lorem ipsum will " +
                "uncover many web sites still uncover in their infancy Various versions uncover have evolved over the years uncover sometimes by accident" +
                " sometimes on purpose injected humour and the like";

        System.out.println(counter(text, "uncover"));
        System.out.println(countLengthEncounters(text));
        encounterchart(text);

    }
}