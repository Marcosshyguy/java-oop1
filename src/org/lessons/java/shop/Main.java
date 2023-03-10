package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto product1 = new Prodotto("biscotti", "Buoni buoni", 189.6889);
        System.out.println("Code: " + product1.getCode() );
        System.out.println(product1.toString());
        System.out.println("Name Code: " + product1.getNameAndCode());
        System.out.println("Product Price: " + product1.getPrice() + "$");
        System.out.println("Product price with VAT: " + product1.GetPriceWithVAT() + "$");
    }
}
