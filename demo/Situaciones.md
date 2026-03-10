
## Situaciones en las que la herencia no se podría realizar
---

### 1. Clase marcada como PRIVADA s
La herencia en Java permite que una clase pueda usar las características de otra. Sin embargo, esto no es posible si la clase está declarada como **private**, porque otras clases no pueden acceder a ella. Por ejemplo, si la clase **Libro** fuera privada, otras clases no podrían heredar sus atributos o métodos. Esto hace que se pierda la ventaja de reutilizar código en el programa. Por eso normalmente la clase base se declara como **public** para que otras clases puedan extenderla.





#public class Libro {

    public String titulo;
    public String autor;
    public int numeroEjem;
    public int numeroEjemPres;
}

##Ejeplo

#private class Libro {
    
}

## 3. Nuevos atributos para la clase libro 

private String editorial;
private int añoPublicacion;

## 4. Metodo

public int calcularLibDispo() {
        return numeroEjem - numeroEjemPres;
    }

