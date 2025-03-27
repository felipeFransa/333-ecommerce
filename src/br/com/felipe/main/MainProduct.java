package br.com.felipe.main;

import br.com.felipe.model.Product;

public class MainProduct {
    public static void main(String[] args) {
        Product product = new Product();

        product.setName("");
        product.setDescription("");

        System.out.println(product.getName());
        System.out.println(product.getDescription());
    }
}
