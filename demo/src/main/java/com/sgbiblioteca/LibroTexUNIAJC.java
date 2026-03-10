package com.sgbiblioteca;

public class LibroTexUNIAJC extends LibroTex {
    private String facultad;

    public LibroTexUNIAJC(String titulo, String autor, int numeroEjem, int numeroEjemPres, String curso, String facultad) {
        super(titulo, autor, numeroEjem, numeroEjemPres, curso); 
        this.facultad = facultad;
    }

    

    
    public String toString() {
        return super.toString() + ", Facultad: " + facultad;
    }
}