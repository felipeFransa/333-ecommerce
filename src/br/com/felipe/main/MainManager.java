package br.com.felipe.main;

import br.com.felipe.model.Manager;

import java.util.Scanner;

public class MainManager {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        // Criar um novo gerente
        Manager manager = new Manager();

        // Solicitar informações do gerente
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

        System.out.println("Enter your age:");
        int age = reading.nextInt();
        reading.nextLine(); // Consumir a nova linha pendente

        System.out.println("Are you a senior manager? (true/false):");
        boolean type = reading.nextBoolean();
        reading.nextLine(); // Consumir a nova linha pendente

        // Definir as informações do gerente
        manager.setName(name);
        manager.setAge(age);
        manager.setType(type);
        manager.setCity(city);

        // Exibir informações do gerente
        System.out.println("\n--- Manager Details ---");
        System.out.println("Name: " + manager.getName());
        System.out.println("Age: " + manager.getAge());
        System.out.println("City: " + manager.getCity());
        System.out.println("Senior Manager: " + manager.isType());

        if (manager.isType()) {
            System.out.println("\n--- Senior Manager Benefits ---");
            System.out.println("Congratulations, " + manager.getName() + "! You have access to senior manager benefits.");
        } else {
            System.out.println("\n--- Regular Manager ---");
            System.out.println("You are a regular manager. Consider working towards senior manager benefits!");
        }
    }
}