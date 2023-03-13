package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        /*BigDecimal numba = new BigDecimal("0.34");
        int numba2 = 2;
        System.out.println(numba.add(numba2));*/


        Prodotto product1 = new Prodotto("biscotti", "Buoni buoni", 189.6889);
        System.out.println("Code: " + product1.getCode() );
        System.out.println(product1.toString());
        System.out.println("Name Code: " + product1.getNameAndCode());
        System.out.println("Product Price: " + product1.getPrice() + "$");
        System.out.println("Product price with VAT: " + product1.GetPriceWithVAT() + "$");
    }
}
