package com.proyecto2;

public class PrendaDeVestir extends Producto{
    private int talla;
    public PrendaDeVestir(String nombre, double precio, int cantidad, int talla){
        super(nombre,precio,cantidad);
        this.talla = talla;
    }

    public void impresionLista(){
        super.impresionLista();
        System.out.println("La talla es " +talla);
    }
}
