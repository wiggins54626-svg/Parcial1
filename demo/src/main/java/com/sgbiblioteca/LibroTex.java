package com.sgbiblioteca;


 public class LibroTex extends Libro {
    private String curso;

    public LibroTex(String titulo, String autor, int numeroEjem, int numeroEjemPres, String curso) {
        super(titulo, autor, numeroEjem, numeroEjemPres);
        this.curso = curso;
    }

    
    public String toString() {
        return super.toString() + ", Curso: " + curso;
    }




}


          
