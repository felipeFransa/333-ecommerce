package br.com.felipe.main;

import br.com.felipe.model.Works;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MainWorks {
    public static void main(String[] args) {
        Works works = new Works();
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        works.setTitle("");
        works.setDescription("");

        System.out.printf(works.getTitle());
        System.out.printf(works.getDescription());
    }
}
