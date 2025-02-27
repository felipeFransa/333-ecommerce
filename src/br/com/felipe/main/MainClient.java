package br.com.felipe.main;

import br.com.felipe.model.Client;
import br.com.felipe.model.Client.TypePlan;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainClient {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

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

        System.out.println("Enter your CEP (Postal Code, 8 digits):");
        String cep = reading.nextLine().trim();
        while (!cep.matches("\\d{8}")) { // Validação de CEP (8 dígitos)
            System.out.println("Invalid CEP. Please enter exactly 8 digits:");
            cep = reading.nextLine().trim();
        }

        System.out.println("Enter your phone number (10 or 11 digits):");
        String phoneNumber = reading.nextLine().trim();
        while (!phoneNumber.matches("\\d{10,11}")) { // Validação de telefone (10 ou 11 dígitos)
            System.out.println("Invalid phone number. Please enter 10 or 11 digits:");
            phoneNumber = reading.nextLine().trim();
        }

        System.out.println("Do you have a premium plan? (BASIC/PREMIUM):");
        String planInput = reading.nextLine().trim().toUpperCase();
        while (!planInput.equals("BASIC") && !planInput.equals("PREMIUM")) { // Validação do tipo de plano
            System.out.println("Invalid plan type. Please enter BASIC or PREMIUM:");
            planInput = reading.nextLine().trim().toUpperCase();
        }
        TypePlan typePlan = TypePlan.valueOf(planInput); // Converte a entrada para o enum TypePlan

        // Criar um novo cliente com os dados fornecidos
        Client client = new Client(name, city, region, phoneNumber, cep, typePlan);

        // Exibir informações do cliente
        System.out.println("\n--- Client Details ---");
        System.out.println("Date: " + currentDate.format(formatter));
        System.out.println("Name: " + client.getName());
        System.out.println("City: " + client.getCity());
        System.out.println("Region: " + client.getRegion());
        System.out.println("CEP: " + client.getCep());
        System.out.println("Phone Number: " + client.getPhoneNumber());

        if (client.getTypePlan() == TypePlan.PREMIUM) {
            System.out.println("\n--- Premium Plan Benefits ---");
            System.out.println("Congratulations, " + client.getName() + "! You have access to premium benefits.");
        } else {
            System.out.println("\n--- Basic Plan ---");
            System.out.println("You are on the basic plan. Consider upgrading for premium benefits!");
        }
    }
}