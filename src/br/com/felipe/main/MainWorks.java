package br.com.felipe.main;

import br.com.felipe.model.Works;

public class MainWorks {
    public static void main(String[] args) {
        Works works = new Works();

        works.setTitle("");
        works.setDescription("");

        System.out.printf(works.getTitle());
        System.out.printf(works.getDescription());
    }
}
