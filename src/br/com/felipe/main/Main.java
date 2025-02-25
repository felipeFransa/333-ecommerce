package br.com.felipe.main;

import br.com.felipe.model.Product;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    // Constantes para mensagens e formatos
    private static final String DATE_FORMAT = "dd/MM/yyyy";
    private static final String WELCOME_MESSAGE = "333-ecommerce";
    private static final String ENTER_PRODUCT_NAME = "Enter the product name:";
    private static final String ENTER_PRODUCT_VALUE = "Enter the product value:";
    private static final String ENTER_PRODUCT_TYPE = "Enter the product type:";
    private static final String PRODUCT_DETAILS_HEADER = "\nProduct Details:";
    private static final String DATE_LABEL = "Date: ";
    private static final String NAME_LABEL = "Name: ";
    private static final String VALUE_LABEL = "Value: ";
    private static final String TYPE_LABEL = "Type: ";

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(WELCOME_MESSAGE);

            // Criar e preencher o produto
            Product product = createProduct(scanner);

            // Exibir detalhes do produto
            displayProductDetails(product);
        }
    }

    // Método para criar e preencher o produto
    private static Product createProduct(Scanner scanner) {
        Product product = new Product();

        System.out.println(ENTER_PRODUCT_NAME);
        product.setName(scanner.nextLine());

        System.out.println(ENTER_PRODUCT_VALUE);
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number for the product value:");
            scanner.next(); // Limpar o valor inválido
        }
        product.setValue(scanner.nextDouble());
        scanner.nextLine(); // Consumir a nova linha

        System.out.println(ENTER_PRODUCT_TYPE);
        product.setType(scanner.nextLine());

        return product;
    }

    // Método para exibir os detalhes do produto
    private static void displayProductDetails(Product product) {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);

        System.out.println(PRODUCT_DETAILS_HEADER);
        System.out.println(DATE_LABEL + currentDate.format(formatter));
        System.out.println(NAME_LABEL + product.getName());
        System.out.println(VALUE_LABEL + product.getValue());
        System.out.println(TYPE_LABEL + product.getType());
    }
}