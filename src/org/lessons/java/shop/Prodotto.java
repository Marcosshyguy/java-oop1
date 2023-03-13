package org.lessons.java.shop;

import java.text.DecimalFormat;
import java.util.Random;

public class Prodotto {

    //ATTRIBUTES
    private final static double VAT = 0.22;

    private String name;

    private String description;

    private double price;

    private int code;

    Random randomizer = new Random();
    DecimalFormat toDecimal = new DecimalFormat("#.##");

    //CONSTRUCTOR
    public Prodotto() {
        code = randomizer.nextInt(1001);

    }

    public Prodotto(String name, String description, double price){
        this.name = name;
        this.description = description;
        this.price = price;
        code = randomizer.nextInt(1001);
    }

    //SETTER AND GETTER
    public String getCode() {
        return padLeft(code);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {

        return  toDecimal.format(price);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Prodotto " +
                "name = " + name + '\'' +
                ", descrizione = " + description + '\'' +
                ", prezzo = " + toDecimal.format(price) + "$" + '\'';
    }

    //METHODS

    public String getNameAndCode (){
        return name.toLowerCase() + padLeft(code);
    }

    public String GetPriceWithVAT(){
        double vatPrice = price * 0.22;
        vatPrice += price;
        String formattedPriceVAT = toDecimal.format(vatPrice);
        return  formattedPriceVAT;
    }

    private String padLeft(int code) {
        String codeString = Integer.toString(code);
        int numZeros = 8 - codeString.length();
        if (numZeros > 0) {
            String zeros = "0".repeat(numZeros);
            return zeros + codeString;
        } else {
            return codeString;
        }
    }

}
