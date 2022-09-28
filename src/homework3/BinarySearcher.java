package homework3;
import java.util.Scanner;
public class BinarySearcher {
    public static void main(String[] args) {
        System.out.println("Загадайте  целое число от 2 до 100 включительно");
        System.out.println("Попробую его отгадать");

        Scanner scanner =  new Scanner(System.in);

        int starter = 2;
        int end = 101 ;
        while (true){
            int guess = starter + (end - starter)/2;
            System.out.println("Ваше число  равно "+guess+" ?");
             int answer = scanner.nextInt();
             if (answer == 1){
                 System.out.println("Угадал!! Игра окончена!!");
                 break;}
             else {
                 System.out.println("Ваше число больше?");
               answer = scanner.nextInt();
               if (answer ==1)
                  starter = guess;
                else
                    end = guess;

             }

        }

    }
}
