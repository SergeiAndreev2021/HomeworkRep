package ru.andreev.homework.multithreading.moneytransfer;

public class Applic {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Account acc1 = new Account(1,10000);
        Account acc2 = new Account(2,5000);
        bank.transferMoney(acc1,acc2,3000);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(acc1.getBalance()+"\n"+acc2.getBalance());
    }
}
