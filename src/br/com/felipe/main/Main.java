package br.com.felipe.main;

import br.com.felipe.model.Product;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDate myDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner reading = new Scanner(System.in);
        System.out.println("333-ecommerce");

        Product product = new Product();

        System.out.println("Enter the product name:");
        String productName = reading.nextLine();
        product.setName(productName);

        System.out.println("Enter the product value:");
        double productValue = reading.nextDouble();
        product.setValue(productValue);

        reading.nextLine(); // Consume the newline character

        System.out.println("Enter the product type:");
        String productType = reading.nextLine();
        product.setType(productType);

        System.out.println("\nProduct Details:");
        System.out.println("Date: " + myDate.format(formatter));
        System.out.println("Name: " + product.getName());
        System.out.println("Value: " + product.getValue());
        System.out.println("Type: " + product.getType());
    }
}