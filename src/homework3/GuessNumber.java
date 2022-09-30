package homework3;
import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  number = (int) (Math.random()*9+1);
        System.out.println("Угадайте число от 1 до 9 включительно");

        while (true){

            int userNum = sc.nextInt();
            if (userNum == 0) break;
            if (userNum == number) {
                System.out.println(" Вы угадали! Победа!!");
                break;
            }
            if (userNum<number)
                  System.out.println("Загаданное число больше, попробуйте другое");
                  else
                System.out.println("Загаданное число меньше, попробуйте другое");
        }
    }
}
