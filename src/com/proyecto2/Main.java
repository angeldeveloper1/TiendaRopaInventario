package com.proyecto2;

/**
 * Metodo principal
 * Creacion de objetos de las subclases
 * Agregar datos a los productos con los parametros
 * Llamar los metodos para la impresion del inventario y cantidad
 */
public class Main {

    public static void main(String[] args) {
        // Instanciando objetos de las clases Accesorio y PrendaDeVestir asignandole datos a los parametros
        // Con esto ya podemos imprimir los productos llamando los metodos de la clase Tienda
        Accesorio aretes = new Accesorio("Aretes",7.99,20,"Aro");
        PrendaDeVestir camiseta = new PrendaDeVestir("Camiseta",10.99,15,36);
        Accesorio collar = new Accesorio("Collar",20.99,10,"Colgante");
        PrendaDeVestir pantalon = new PrendaDeVestir("Pantalon",34.99,10,28);
        PrendaDeVestir boxer = new PrendaDeVestir("Boxer",8.99,30,32);
        // Instanciando el objeto tienda de la clase Tienda para poder hacer la llamada de los metodos
        Tienda tienda = new Tienda();

        // Llamando metodo agregarProducto de la clase Tienda con el objeto tienda, dandole un objetos como parametros
        tienda.agregarProducto(aretes);
        tienda.agregarProducto(camiseta);
        tienda.agregarProducto(collar);
        tienda.agregarProducto(pantalon);
        tienda.agregarProducto(boxer);

        // Llamando metodo para imprimir el inventario
        tienda.imprimirInventario();
        // Salto de linea
        System.out.println("\n");
        // Llamando metodo para imprimir la cantidad de productos del inventario
        tienda.imprimirCantidad();

    }
}