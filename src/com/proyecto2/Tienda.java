package com.proyecto2;

/**
 * Creando la clase tienda que tendran los metodos de las impresiones
 * (cantidad de productos, agregacion de productos, impresion del inventario)
 */
public class Tienda {
    // Atributos de la clase Tienda

    // Creando variable de instancia llamada inventario que es un array de objetos del tipo Producto
    // Cada elemento del arreglo sera una instancia de la clase Producto.
    // Esto sirve para poder trabajar con los atributos y metodos de la clase Producto
    private Producto[] inventario;
    // Atributo cantidad que sera usado para imprimir la cantidad de productos totalel
    // Usado para imprimir la lista de inventario y usando un for que recorra hasta la cantidad del inventario
    private int cantidad;
    // Constructor de la clase Tienda
    public Tienda() {
        // Se inicializa la variable inventario como un nuevo arreglo de Producto con una longitud de 10 elementos.
        inventario = new Producto[10];
        // Se inicializa la variable cantidad como 0
        cantidad = 0;
    }
    // Metodo para agregar producto al inventario.
    // Esta tiene un parametro producto con tipo de dato Producto
    // El parametro nos sirve para pasar objetos de las subclases de Producto o de la misma, que contienen los detalles de los productos
    public void agregarProducto(Producto producto){
        // El objeto producto que se pasa como argumento se agrega al arreglo inventario
        // La cantidad sera la posicion en la que se va a almacenar, inventario[0], inventario[1], y asi sucesivamente
        // Se aumenta con la linea cantidad++
        inventario[cantidad] = producto;
        cantidad++;
    }
    // Metodo para imprimir el nombre y el precio del producto en la consola
    public void imprimirInventario(){
        // For para recorrer la cantidad de productos, una vez que se este recorriendo cada producto, se imprimira el nombre y precio
        for (int i = 0; i < cantidad; i++){
            // recorrera el array inventario para imprimir el nombre y precio. Usando getNombre y getPrecio.
            // Gracias al usar la clase Producto como tipo de dato, podemos acceder a los atributos.
            System.out.println("Producto: " + inventario[i].getNombre() + " -- Precio: $" + inventario[i].getPrecio());
        }
    }
    // Imprimir la cantidad de productos que hay en el inventario
    public void imprimirCantidad() {
        System.out.println("Productos totales: " +cantidad);
    }

}
