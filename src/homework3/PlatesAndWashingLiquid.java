package homework3;
import java.util.Scanner;
public class PlatesAndWashingLiquid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество тарелок, положительное целое число");
        int userPlate = sc.nextInt();

        System.out.println("Введите количество  моющей жидкости, положительное число");
        double liquid = sc.nextDouble();
        double needLiquid = userPlate*0.5;
        while (userPlate>=1 && liquid>=0.5){
            userPlate--;
            liquid = liquid-0.5;

            System.out.println("осталось "+liquid+" моющего средства");
        }
        System.out.println("Осталось "+userPlate+" тарелок");
        System.out.println("Осталось "+liquid+" моющего средства");
    }
}
