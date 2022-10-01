package homework4;

import java.util.Arrays;

public class EvenNUmbersBackwards {
    public static void main(String[] args) {
        int [] evenNumbers = new int[10];
        int firstNumber =2;
        for (int i = 0; i <evenNumbers.length ; i++) {
            evenNumbers[i] = firstNumber;
            firstNumber+=2;
        }
        System.out.println(Arrays.toString(evenNumbers));

        for (int i = evenNumbers.length-1; i >=0 ; i--) {
            System.out.print(evenNumbers[i]+" ");
        }
    }
}
