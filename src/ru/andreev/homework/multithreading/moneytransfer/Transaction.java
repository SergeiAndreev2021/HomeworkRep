package ru.andreev.homework.multithreading.moneytransfer;

public class Transaction implements Runnable {
    private Account src; // с какого аккаунта осуществлять перевод
    private Account dst; // на какой аккаунт осуществлять перевод
    private int money; // сколько переводить

    public Transaction(Account src, Account dst, int money) {
        this.src = src;
        this.dst = dst;
        this.money = money;
    }


    @Override
    public void run() {
        // TODO перевод денежных средств со счета src на счет dst в количестве money
        if (src.getBalance()<money) System.out.println("Not enough money");
        else {
            int newSumDst = dst.getBalance()+money;
            int newSumSrc = dst.getBalance()-money;
            dst.setBalance(newSumDst);
            src.setBalance(newSumSrc);
        }
        }

}
