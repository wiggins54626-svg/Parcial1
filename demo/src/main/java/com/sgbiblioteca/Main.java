package com.sgbiblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Libro libro1 = new Libro("Shingeki no Kyojin", " Hajime Isayama", 5, 2);

        
        Scanner sc = new Scanner(System.in);
        Libro libro2 = new Libro();
        System.out.print("Ingrese título: ");
        libro2.setTitulo(sc.nextLine());
        System.out.print("Ingrese autor: ");
        libro2.setAutor(sc.nextLine());
        System.out.print("Ingrese número de Libros: ");
        libro2.setNumeroEjem(sc.nextInt());
        System.out.print("Ingrese número de Libros prestados: ");
        libro2.setNumeroEjemPres(sc.nextInt());

        
        LibroTexUNIAJC textoUniac = new LibroTexUNIAJC("Matemáticas I","Carlos Pérez",10,4,
                "Ingeniería","Facultad de Ciencias");

        
        Novela novela = new Novela("1984","George Orwell",6,2,"Ciencia ficción");

       
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(textoUniac);
        System.out.println(novela);

        
        System.out.println("Préstamo libro1: " + libro1.PresLibro());
        System.out.println("Devolución libro1: " + libro1.DevLibro());

        System.out.println("Préstamo novela: " + novela.PresLibro());
        System.out.println("Devolución novela: " + novela.DevLibro());
    }
}
