package homework2;

public class DiscountAmount {
    public static void main(String[] args) {
        double sum = 4000;
        int saleCode = 0xb1010;

        switch (saleCode){

            case 4525 :
                System.out.println(sum*0.7);
                break;
            case 6424 :
            case 7012 :
                System.out.println(sum*0.8);
                break;
            case 7647 :
            case 9011 :
            case 6612 :
                System.out.println(sum*0.9);
                break;
            default :
                System.out.println(sum);
        }
    }
}
