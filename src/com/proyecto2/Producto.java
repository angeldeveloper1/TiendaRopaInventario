package com.proyecto2;

/**
 * Simulacion para guardar producto al
 * inventario en una tienda de ropa
 * Usando Herencia, Encapsulación, Getters/Setters, constructores, super(), y Array.
 * Impresion de la cantidad de productos disponibles en la consola, El nombre y el precio.
 */

/**
 * Creacion de la clase producto que tendra los detalles del producto
 */
public class Producto {
    // Atributos nombre, precio y cantidad del producto
    private String nombre;
    private double precio;
    private int cantidad;

    // Constructor con parametros para inicializar los atributos
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    // getters para poder recibir los datos de los atributos nombre y precio e imprimirlo
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
}
