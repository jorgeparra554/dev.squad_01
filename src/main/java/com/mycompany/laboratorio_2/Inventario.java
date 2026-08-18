/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio_2;

/**

 */

import java.util.ArrayList;
import java.util.Collections;

public class Inventario {

    /*
// Ejercicio 5
    
    private Producto[] productos = new Producto[10];
    private int cantidadProductos = 0;
    
//AGREGAR PRODUCTO
    
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
    }*/
    
// Ejercicio 6 - Uso de ArrayLists

    private ArrayList<Producto> productos = new ArrayList<>();


    // AGREGAR PRODUCTO

    public void agregarProducto(Producto p) {
        productos.add(p);
    }


// ELIMINAR PRODUCTO POR CODIGO

    public void eliminarProducto(String codigo) {
        for (int i = 0; i < productos.size(); i++) {

            if (productos.get(i).getCodigo().equals(codigo)) {
                productos.remove(i);
                return;
            }
        }
    }


// BUSCAR PRODUCTO POR NOMBRE

    public Producto buscarProducto(String nombre) {
        for (Producto p : productos) {

            if (p.getNombre().equals(nombre)) {
                return p;
            }
        }

        return null;
    }


// ORDENAR PRODUCTOS POR PRECIO

    public void ordenarPorPrecio() {
        Collections.sort(productos, (p1, p2) ->
                Double.compare(p1.getPrecio(), p2.getPrecio()));
    }


// BUSCAR PRODUCTOS POR RANGO DE PRECIO

    public ArrayList<Producto> buscarProductosPorRango(double min, double max) {

        ArrayList<Producto> resultados = new ArrayList<>();

        for (Producto p : productos) {

            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                resultados.add(p);
            }
        }

        return resultados;
    }

}
    
