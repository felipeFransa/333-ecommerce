package br.com.felipe.main;

import br.com.felipe.model.Manager;

import java.util.Scanner;

public class MainManager {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        Manager manager = new Manager();

        System.out.println("Enter your name:");
        String name = reading.nextLine();
        System.out.println("Enter your city:");
        String city = reading.nextLine();

        manager.setFirstName(name);
        manager.setAge(28);
        manager.setType(true);
        manager.setCity(city);
    }
}
