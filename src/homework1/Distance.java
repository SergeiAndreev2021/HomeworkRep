package homework1;

public class Distance {
    public static void main(String[] args) {
        // объявляем  и инициализируем пременную для количества часов в пути
        double hour = 4;
        // объявляем и инициализируем пременную для количества пройденных километров
        double distance = 93;
        // объявляем и вычисляем пременную для скорости в км/ч
        double speedKMH = distance/hour;
        // объявляем и вычисляем переменную для скорочти м/c
        double speedMSec = (speedKMH*1000)/3600;
        // Выводим результат в консоль
        System.out.println("Скорость равна "+speedMSec+" м/с");
    }
}
