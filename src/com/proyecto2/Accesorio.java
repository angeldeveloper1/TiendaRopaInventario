package com.proyecto2;

/**
 * Creando la clase accesorio (clase hija) que extiende la clase Producto (clase padre)
 */
public class Accesorio extends Producto{
    // Atributo adicional de la clase Accesorio tipoAccesorio
    private String tipoAccesorio;
    // Constructor de la clase Accesorio
    // Un parametro adicional para el tipoAccesorio
    public Accesorio(String nombre, double precio, int cantidad, String tipoAccesorio){
        // super para poder llamar al constructor de la clase Producto (superclase)
        super(nombre,precio,cantidad);
        //inicializando tipoAccesorio;
        this.tipoAccesorio = tipoAccesorio;
    }
}