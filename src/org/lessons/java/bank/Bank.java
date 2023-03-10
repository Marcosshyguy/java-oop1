package org.lessons.java.bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Add your name: ");
        String newCostumer = scan.nextLine();

        Conto newBankAccount = new Conto(newCostumer);
        System.out.println(newBankAccount.toString());

        /*newBankAccount.storeMoney(40.50);
        newBankAccount.storeMoney(30);
        newBankAccount.getMoney(100);*/
        System.out.println(newBankAccount.getBankBalance());


    }
}
