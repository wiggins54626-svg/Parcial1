package com.sgbiblioteca;

public class Novela extends Libro {
    private String tipo;

    public Novela(String titulo, String autor, int numeroEjem, int numeroEjemPres, String tipo) {
        super(titulo, autor, numeroEjem, numeroEjemPres); 
        this.tipo = tipo;
    }

    
    public String toString() {
        return super.toString() + ", Tipo de novela: " + tipo;
    }
}