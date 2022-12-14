package homework4;
import java.util.Arrays;
import java.util.stream.*;
public class ArrMaxMinMiddle {
    public static void main(String[] args) {
        // Генерируем  количество элементов в массиве n : от 1 до 30;
        int n = (int) (Math.random()*30+1);

        int [] array = new int[n];

        //  заполняем массив случайными целыми числами  в диапазоне"-1000 +1000ж
        for (int i = 0; i < array.length ; i++) {
            array[i] = (int) (Math.random()*2000 -1001);
        }
        // Выведем его на экран для наглядности

        for ( int a : array) System.out.print(a+" ");
        System.out.println();

        // найдём минимум и  максимум и  выведем его на экран
        // найдем среднее арифметическое целое  и выведем на экран (может быть отрицательеым)
        int min = array[0];
        int max = array[0];
        int sum =0;
        for (int i = 1; i <array.length ; i++) {
            if (array[i]<min) min = array[i];
            if (array[i]>max) max = array[i];
            sum+=array[i];
        }
        System.out.println("Минимальное число в массиве : "+min);
        System.out.println("Максимальное число в массиве : "+max);
        int middleArith = sum/array.length;
        System.out.println("Среднее арифметическое : "+middleArith);
        }
    }

