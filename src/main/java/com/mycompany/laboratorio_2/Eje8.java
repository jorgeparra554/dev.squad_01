/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio_2;

/**
 *
 * @author Tatia
 */
import java.util.ArrayList;

public class Eje8 {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Laptop Gaming", 1299.99, 10, "TECH-001"));
        productos.add(new Producto("iPhone 15", 1099.99, 15, "TECH-002"));

        GestorArchivos.guardarInventarioEnArchivo(productos, "inventario.txt");
    }
}