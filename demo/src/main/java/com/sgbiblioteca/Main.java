package com.sgbiblioteca;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro();
        libro.setNumeroEjem(3);
        libro.setNumeroEjemPres(1);

        System.out.println("Préstamo 1: " + libro.PresLibro()); // true
        System.out.println("Préstamo 2: " + libro.PresLibro()); // true
        System.out.println("Préstamo 3: " + libro.PresLibro()); // false
    }
}
