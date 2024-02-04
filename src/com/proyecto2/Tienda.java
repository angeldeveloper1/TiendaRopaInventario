package com.proyecto2;

public class Tienda {

    private Producto[] inventario;
    private int cantidad;

    public Tienda() {
        inventario = new Producto[10];
        cantidad = 0;
    }

    public void agregarProducto(Producto producto){
        inventario[cantidad] = producto;
        cantidad++;
    }

    public void imprimirInventario(){
        for (int i = 0; i < cantidad; i++){
            System.out.println("Producto: " + inventario[i].getNombre() + " -- Precio: $" + inventario[i].getPrecio());
        }
    }

    public void imprimirCantidad() {
        System.out.println("Productos totales: " +cantidad);
    }

}
