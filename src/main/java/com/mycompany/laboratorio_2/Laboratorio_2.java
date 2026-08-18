/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laboratorio_2;

/**
 
 */
public class Laboratorio_2 {
    public static void main(String[] args) {
        Producto laptop = new Producto("Laptop Gaming", 1299.99, 10, "TECH-001");
        
        System.out.println("Codigo: " + laptop.getCodigo());
        System.out.println("Precio: $" + laptop.getPrecio());
    
// DESAFIO CREATIVO EJERCICO 2
       Producto telefono = new Producto("iPhone 15", 1099.99, 15, "TECH-002");
       Producto audifonos = new Producto("AirPods Pro", 249.99, "TECH-003");
       Producto cargador = new Producto("Cargador USB-C", 29.99); // Código automático
       Producto vacio = new Producto();
    
       System.out.println(telefono.getCodigo() + " - cantidad: " + telefono.getCantidad());
       System.out.println(audifonos.getCodigo() + " - cantidad: " + audifonos.getCantidad());
       System.out.println(cargador.getCodigo() + " - cantidad: " + cargador.getCantidad());
       System.out.println("Vacío: " + vacio.getNombre() + " | " + vacio.getCodigo());
    
       
// EJERCICIO 3- SOBRECARGA DE METODOS
       System.out.println("Precio laptop con 15% descuento: $" + laptop.aplicarDescuento(15.0));
       System.out.println("Precio telefono con $100 descuento fijo: $" + telefono.aplicarDescuento(100.0,true));
       
       
////EJERCICIO 4 LLAMADOS A METODOS INTERNOS 
        Producto macbook = new Producto("MacBook Pro", 1999.99, 5, "TECH-004");
        System.out.println("Valor inventario MacBook: $" + macbook.calcularValorInventario());
        System.out.println("Valor con 10% descuento: $" + macbook.calcularValorConDescuento(10.0));
    
//EJERCICIO 5 USO DE ARREGLOS

     /*
        Inventario inventario = new Inventario();
        inventario.agregarProducto(new Producto("Teclado Mecánico", 89.99, 20, "TECH-005"));
        inventario.agregarProducto(new Producto("Mouse Gaming", 49.99, 30, "TECH-006"));
        inventario.mostrarInventario();
        System.out.println("Total de productos: " + inventario.contarProductos());
        */
        
  //EJERCICIO 6

       Inventario inventario = new Inventario();
       inventario.agregarProducto(new Producto("Teclado Mecánico", 89.99, 20, "TECH-005"));
       inventario.agregarProducto(new Producto("Mouse Gaming", 49.99, 30, "TECH-006"));

// ELIMINAR PRODUCTO

       inventario.eliminarProducto("TECH-005");

// BUSCAR PRODUCTO

       Producto encontrado = inventario.buscarProducto("Mouse Gaming");

       if (encontrado != null) {
         System.out.println("Producto encontrado: " + encontrado.getNombre());
         System.out.println("Precio: $" + encontrado.getPrecio());
         System.out.println("Código: " + encontrado.getCodigo());
}
       
       
    }

}
