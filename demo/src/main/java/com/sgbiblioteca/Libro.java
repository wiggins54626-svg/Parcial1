package com.sgbiblioteca;

public class Libro {

    public String titulo;
    public String autor;
    public int numeroEjem;
    public int numeroEjemPres;


    public Libro() {
    }


    
 
    

   

    public Libro(String titulo, String autor, int numeroEjem, int numeroEjemPres) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjem = numeroEjem;
        this.numeroEjemPres = numeroEjemPres;
    }








    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public int getNumeroEjem() {
        return numeroEjem;
    }


    public void setNumeroEjem(int numeroEjem) {
        this.numeroEjem = numeroEjem;
    }


    public int getNumeroEjemPres() {
        return numeroEjemPres;
    }


    public void setNumeroEjemPres(int numeroEjemPres) {
        this.numeroEjemPres = numeroEjemPres;
    }

//metodos

    public boolean PresLibro(){
        if (numeroEjem > numeroEjemPres){
            numeroEjemPres = numeroEjemPres + 1;
        
            return true;
        }
            else {
                return false;
            }
        }
        

          public boolean DevLibro(){
            if (numeroEjemPres >0) {
                numeroEjemPres = numeroEjemPres - 1;
                return true;
            }

            else {
                return false;
            }
                
            }
          }  


         


        

        


    


    



