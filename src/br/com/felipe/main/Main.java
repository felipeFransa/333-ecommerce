package br.com.felipe.main;

import br.com.felipe.model.Product;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDate myDate = LocalDate.now();
        Scanner reading = new Scanner(System.in);
        System.out.println("333-ecommerce");
        Product product = new Product();

        System.out.println("enter your name product:");
        String nameProduct = reading.nextLine();

        product.setFirstName(nameProduct);
        product.setValue(0);
        product.setType("");

        System.out.println(myDate);
        System.out.println(product.getFirstName());
        System.out.println(product.getValue());
        System.out.println(product.getType());
    }
}
