
## Situaciones en las que la herencia no se podría realizar
---

### 1. Clase marcada como 
- 	Descripción: Una clase declarada como  no puede ser extendida por ninguna otra.
- 	Ejemplo aplicado: Si la clase  se declarara como , entonces ,  y  no podrían heredar de ella.
- 	Impacto: Se rompe la jerarquía de herencia y se limita la reutilización de código.
- 	Categoría SWEBOK: Diseño orientado a objetos – Restricciones de herencia.

### 2. Clase con modificador 
- 	Descripción: Una clase declarada como  no puede ser utilizada fuera del archivo donde está definida.
- 	Ejemplo aplicado: Si  fuera , las clases  o  no podrían acceder a ella ni extenderla.
- 	Impacto: La clase queda encapsulada y no disponible para herencia, aunque exista en el sistema.
- 	Categoría SWEBOK: Diseño orientado a objetos – Encapsulamiento y visibilidad.

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

