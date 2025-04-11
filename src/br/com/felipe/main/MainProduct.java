package br.com.felipe.main;

import br.com.felipe.model.Product;

import java.util.Scanner;

public class MainProduct {
    public static void main(String[] args) {
        Product product = new Product();
        Scanner reading = new Scanner(System.in);

        System.out.println("Enter your name product:");
        String nameProduct = reading.nextLine();

        System.out.println("Enter your description:");
        String description = reading.nextLine();

        product.setName(nameProduct);
        product.setDescription(description);

        System.out.println(product.getName());
        System.out.println(product.getDescription());
    }
}
