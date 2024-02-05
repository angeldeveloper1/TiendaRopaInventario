package com.proyecto2;

/**
 * Clase PrendaDeVestir (clase hija) que extiende la clase Producto (clase padre)
 */
public class PrendaDeVestir extends Producto{
    // Atributo adicional de la clase PrendaDeVestir que es talla
    private int talla;
    // Constructor de la clase PrendaDeVestir
    // Agregacion de un parametro mas al constructor: talla
    public PrendaDeVestir(String nombre, double precio, int cantidad, int talla){
        // super para llamar al constructor de la clase padre con los parametros nombre,precio,cantidad
        super(nombre,precio,cantidad);
        // inicializando el atributo talla
        this.talla = talla;
    }
}
