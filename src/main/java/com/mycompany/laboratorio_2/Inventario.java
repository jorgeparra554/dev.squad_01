/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio_2;

/**

 */
public class Inventario {
    private Producto[] productos = new Producto[10];
    private int cantidadProductos = 0;
    
//AGGREGAR PRODUCTO
    
    public void agregarProducto (Producto p){
        if (cantidadProductos == 10){
            System.out.println("Inventario lleno, no se puede agregar mas productos. ");
            return;
        }
        productos[cantidadProductos]=p;
        cantidadProductos++;
    }
    
 //MOSTRAR INVENTARIO
    
    public void mostrarInventario() {
        for (int i = 0; i < cantidadProductos; i++){
            Producto p = productos [i];
            System.out.println(p.getCodigo() + "|" + p.getNombre()+ "|$"+ p.getPrecio() +"|Cantidad" + p.getCantidad());
        }
    }
    
//CONTAR PRODUCTO    
    
    public int contarProductos() {
        return cantidadProductos;
    }
    
    
    
    
}
