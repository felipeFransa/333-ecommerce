package br.com.felipe.main;

import br.com.felipe.model.Client;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainClient {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Criar um novo cliente
        Client client = new Client();

        // Solicitar informações do cliente
        System.out.println("Enter your name:");
        String name = reading.nextLine().trim();
        while (name.isEmpty()) {
            System.out.println("Name cannot be empty. Please enter your name:");
            name = reading.nextLine().trim();
        }

        System.out.println("Enter your city:");
        String city = reading.nextLine().trim();
        while (city.isEmpty()) {
            System.out.println("City cannot be empty. Please enter your city:");
            city = reading.nextLine().trim();
        }

        System.out.println("Enter your region:");
        String region = reading.nextLine().trim();
        while (region.isEmpty()) {
            System.out.println("Region cannot be empty. Please enter your region:");
            region = reading.nextLine().trim();
        }

        System.out.println("Enter your CEP (Postal Code):");
        int cep = reading.nextInt();
        reading.nextLine(); // Consumir a nova linha pendente

        System.out.println("Enter your phone number:");
        int phoneNumber = reading.nextInt();
        reading.nextLine(); // Consumir a nova linha pendente

        System.out.println("Do you have a premium plan? (true/false):");
        boolean typePlan = reading.nextBoolean();
        reading.nextLine(); // Consumir a nova linha pendente

        // Definir as informações do cliente
        client.setName(name);
        client.setCity(city);
        client.setRegion(region);
        client.setCep(cep);
        client.setPhoneNumber(phoneNumber);
        client.setTypePlan(typePlan);

        // Exibir informações do cliente
        System.out.println("\n--- Client Details ---");
        System.out.println("Date: " + currentDate.format(formatter));
        System.out.println("Name: " + client.getName());
        System.out.println("City: " + client.getCity());
        System.out.println("Region: " + client.getRegion());
        System.out.println("CEP: " + client.getCep());
        System.out.println("Phone Number: " + client.getPhoneNumber());

        if (client.getTypePlan()) {
            System.out.println("\n--- Premium Plan Benefits ---");
            System.out.println("Congratulations, " + client.getName() + "! You have access to premium benefits.");
        } else {
            System.out.println("\n--- Basic Plan ---");
            System.out.println("You are on the basic plan. Consider upgrading for premium benefits!");
        }
    }
}