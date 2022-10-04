package homework4;

import java.util.Arrays;
 import java.util.Scanner;

public class FillStringArray {
    public static void main(String[] args) {
        // Генерируем  количество элементов в массиве n : от 1 до 30;
        int n = (int) (Math.random()*30+1);

        String[] vocabular = new String[n];
        System.out.println("Заполните массив словами, слова не должны повторяться.");
        System.out.println("Если желаете выйти - введите \"exit\".");
        System.out.println("В вашем массиве "+n+" слов");
        Scanner sc = new Scanner(System.in);
        int index=0; // <-  переменная для подсчета закрепленных в массиве слов
        while (true){
           if (index ==0) System.out.println("Введите  первое слово");
           else System.out.println("Введите следующее слово");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Спасибо за пользование программой.");
                break;
            }

            if (input.isEmpty()){
                System.out.println("Вы ввели пустое слово, введите полноценное слово ");
                continue;
            }


            int count =0; //переменная для подсчета совпадений
            for (int i = 0; i <index+1 ; i++) {
                if (input.equals(vocabular[i])) {
                          count++;
                          break;
                }
            }

                    if (count >0)
                    {System.out.println("Данное слово уже есть в массиве, введите другое слово");}
                  
                    else{
                        vocabular[index] = input;
                        index++;
                    }
                    if (index == n) break;
        }
        System.out.println("Ваш массив уникальных слов : "+Arrays.toString(vocabular));
    }
}
