package org.lessons.java.bank;

import java.text.DecimalFormat;
import java.util.Random;

public class Conto {

    //    ATTRIBUTES
    private double bankBalance;

    private String name;

    private int bankAccount;

    Random randomizer = new Random();
    DecimalFormat toDecimal = new DecimalFormat("#.##");
    //CONSTRUCTOR

    public Conto(String name) {
        this.name = name;
        bankBalance = 0.00;
        bankAccount = randomizer.nextInt(1,1001);
    }

    public Conto(){
        this(null);
    }

    //GETTER AND SETTER


    public String getBalanceString () {
        return toDecimal.format(bankBalance);
    }

    public double getBalance(){
        return bankBalance;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //METHODS


    @Override
    public String toString() {
        return "Conto " +
                "bankBalance =" + toDecimal.format(bankBalance) + " $"+
                ", name =" + name+
                ", bankAccount =" + bankAccount;
    }

    public double getMoney(double moneyTook){

            return bankBalance -= moneyTook;

    }

    public double storeMoney(double moneyAdded){
        return bankBalance += moneyAdded;
    }
}
