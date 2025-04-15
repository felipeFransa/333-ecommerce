package br.com.felipe.main;

import br.com.felipe.model.Works;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainWorks {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        Works works = new Works();
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("Enter your title");
        String titleWork = reading.nextLine();

        System.out.println("enter your description");
        String descriptionWork = reading.nextLine();

        works.setTitle(titleWork);
        works.setDescription(descriptionWork);

        System.out.printf(works.getTitle());
        System.out.printf(works.getDescription());

        System.out.printf(currentDate.format(dateFormatter));
        System.out.printf(currentTime.format(timeFormatter));
    }
}
