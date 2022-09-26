package homework2;

public class Interview {
    public static void main(String[] args) {
        int age = -105;
        int exp = -7;
        if (age < 0 ||  exp<0)
            System.out.println("wrong age or / and exp");
        else if (age <100 && age > 17) {
            if (exp < 5)
                System.out.println("Trainee position available");
            else
                System.out.println("Developer position available");
        }
        else {
            System.out.println("We will call you back later");
        }
    }
}
