package homework1;

public class ParallelepipedSquare {


    public static void main(String[] args) {
        int length;            // объявляем пременную для длинны параллелепипеда
        int width;             // объявляем пременную для ширины параллелепипеда
        int height;            // объявляем пременную для высоты параллелепипеда
        int square;            // объявляем пременную для площади параллелепипеда

         //  инициализируем переменнные случайными значениями
         length = 6;
         width = 5;
         height = 4;
         // Площадь параллелепипеда (square) равна : ширина * высота* длинна
         square = length * width * height;
         // Выводим square  на конслоь
         System.out.println(square);
    }
}
