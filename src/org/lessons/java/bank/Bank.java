package org.lessons.java.bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        boolean flag = false;

        Scanner scan = new Scanner(System.in);
        System.out.print("Add your name: ");
        String newCostumer = scan.nextLine();

        Conto newBankAccount = new Conto(newCostumer);
        System.out.println(newBankAccount.toString());


        while (!flag) {
            Scanner input = new Scanner(System.in);

            System.out.println("Make a choice");
            System.out.println("Select 1 if you want to deposit money");
            System.out.println("Select 2 if you want to take money");
            System.out.println("Select 3 to exit");
            int choice = input.nextInt();

            if (choice == 1){
                System.out.println("How much money do you want to deposit?");
                double moneyDeposited = input.nextDouble();
                newBankAccount.storeMoney(moneyDeposited);
                System.out.println("Now you have: " + newBankAccount.getBalanceString()+ "$");
            } else if (choice == 2) {
                System.out.println("How much money do you want to take?");
                double moneyTook = input.nextDouble();
                if ( newBankAccount.getBalance() < moneyTook){
                    System.out.println("You don't have enough money");
                }else {
                newBankAccount.getMoney(moneyTook);
                System.out.println("Now you have: " + newBankAccount.getBalanceString()+ "$");
                }
            }else if(choice == 3){
                flag = true;
                System.out.println("Bye bye!");
            }else {
                System.out.println("Wrong choice");
            }
        }

    }
}



