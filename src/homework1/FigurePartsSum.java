package homework1;

public class FigurePartsSum {
    public static void main(String[] args) {
        // объявляем и инициализируем целочисленную двузначную пременную
        int figure = 98;
        //  число содержит 3 десятка и 6 единиц

        //  вычисляем первое число
        int figure1 = figure/10;
        //  вычисляем второе число
        int figure2 = figure%10;

        // выводим сумму на консоль
        System.out.println(figure1 + figure2);
    }
}
