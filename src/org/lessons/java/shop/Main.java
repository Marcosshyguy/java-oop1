package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto product1 = new Prodotto("biscotti", "Buoni buoni", 0.99);
        System.out.println("Bank account: " + product1.getNameAndCode());
        System.out.println("Product Price: " + product1.getPrice() + "$");
        System.out.println("Product price with VAT: " + product1.GetPriceWithVAT() + "$");
    }
}
