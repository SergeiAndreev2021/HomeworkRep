package ru.andreev.homework.homework5.productsallowed;

public class MyProducts {

    private int maxBelki;
    private int maxFat;
    private int maxUglevod;
    private int maxCalories;
    private int productCount =0;
    //  примем максимальное количество продуктов в списке за 10
    private Product[] prodList = new Product[10];

    // Конструктором зададим макисмальные значения количества компонентов у продуктов


    public MyProducts(int maxBelki, int maxFat, int maxUglevod, int maxCalories) {
        this.maxBelki = maxBelki;
        this.maxFat = maxFat;
        this.maxUglevod = maxUglevod;
        this.maxCalories = maxCalories;
    }


    // Сделаем сеттеры, дабы можно было изменить пределы количества компонентов в связи с врачебным предписанием


    public void setMaxBelki(int maxBelki) {
        this.maxBelki = maxBelki;
    }

    public void setMaxFat(int maxFat) {
        this.maxFat = maxFat;
    }

    public void setMaxUglevod(int maxUglevod) {
        this.maxUglevod = maxUglevod;
    }

    public void setMaxCalories(int maxCalories) {
        this.maxCalories = maxCalories;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    // Сделаем геттер для массива продуктов, чтобы можно было  к нему обратиться и вывести на экран

    // метод добавления
    public void addProduct(Product product){
        if (productCount == 10){
            System.out.println("Список покупок полон, купите "+product.getName() + " в другой раз");
            return;
        }


        if (product.getBelok() > maxBelki){
            System.out.println(product.getName() + " содержит слишком много белка");
            return;
        }
        if (product.getFat() > maxFat) {
            System.out.println(product.getName() + " содержит слишком много жиров");
            return;
        }

        if (product.getUglevod() > maxUglevod) {
            System.out.println(product.getName() + " содержит слишком много углеводов");
            return;
        }

        if (product.getCalories() > maxCalories) {
            System.out.println(product.getName() + " содержит слишком много Калорий");
            return;
        }
        prodList[productCount] = product;
        productCount++;
    }

    // метод вывода
    public  void printProdList(){
        if (productCount == 0){
            System.out.println("Список пуст");
            return;}
        System.out.println("В списке содержится "+productCount+" продуктов :");
        for (Product p : prodList) {
            if (p != null)
            System.out.println(p);
        }

    }
}
