package homework2;

public class RandomLine {
    public static void main(String[] args) {
        // Генерируем случайное число
        int number = (int) (Math.random()*500) +10;
        // Сравниваем диапазоны
        if (number>25 && number<200)
            System.out.println("число "+ number+ " попадает в диапазон от 25 до 200 НЕ включительно");
        else
            System.out.println("число "+ number+ " не попадает в диапазон от 25 до 200 НЕ включительно");


    }
}
