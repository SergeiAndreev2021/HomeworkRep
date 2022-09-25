package homework2;

public class RightAnswers {
    public static void main(String[] args) {
        int count = 56;
        if (count >89 && count <101)
            System.out.println("Отлично");
        else  if (count>59 && count < 90)
            System.out.println("Хорошо");
        else  if (count>39 && count < 60)
            System.out.println("Удовлетворительно");
        else
            System.out.println("Попробуйте в следующий раз");
    }
}
