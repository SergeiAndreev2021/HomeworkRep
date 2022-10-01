package homework4;

public class NegativeArray {
    public static void main(String[] args) {
        // Генерируем  количество элементов в массиве n : от 1 до 30;
        int n = (int) (Math.random()*30+1);

        int [] array = new int[n];

        //  заполняем массив случайными целыми числами  в диапазоне"-100 +100ж
        for (int i = 0; i < array.length ; i++) {
            array[i] = (int) (Math.random()*200 -101);
        }
        // для наглядности выводим полученный массив
        for (int a : array) System.out.print(a+" ");
        System.out.println();

        int count =0;  //  счетчик отрицательных значений
        for (int value : array) {
            if (value < 0) count++;
        }
        int [] arrayNegative = new int[count];

        int z =0; // индекс массива с негаивными значениями

        for (int i = 0; i < array.length ; i++) {
           if (array[i]<0){
              arrayNegative[z]=array[i];
              z++;
           }
        }
        //  выводим итоговый массив
        for (int a : arrayNegative) System.out.print(a+" ");
    }
}
