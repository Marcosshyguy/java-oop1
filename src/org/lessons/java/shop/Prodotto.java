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

    //CONSTRUCTOR
    public Prodotto() {
        code = randomizer.nextInt(10001);
    }

    public Prodotto(String name, String description, double price){
        this.name = name;
        this.description = description;
        this.price = price;
        code = randomizer.nextInt(1001);
    }

    //SETTER AND GETTER
    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
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
        return "Prodotto{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price + '\'' +
                '}';
    }

    //METHODS

    public String getNameAndCode (){
        return name.toLowerCase() + code;
    }

    public String GetPriceWithVAT(){
        DecimalFormat toDecimal = new DecimalFormat("#.##");
        double vatPrice = price * 0.22;
        vatPrice += price;
        String formattedPrice = toDecimal.format(vatPrice);
        return  formattedPrice;
    }

}
