/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio_2;

/**
 *
 * @author Tatia
 */
public class Eje7 {
    public static void main(String[] args) {
        try {
            System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        } catch (java.io.UnsupportedEncodingException e) {
            System.out.println("No se pudo configurar UTF-8");
        }

        Inventario inventario = new Inventario();
        inventario.agregarProducto(new Producto("Laptop Gaming", 1299.99, 10, "TECH-001"));
        inventario.agregarProducto(new Producto("iPhone 15", 1099.99, 15, "TECH-002"));

        System.out.println("===== Caso válido =====");
        Producto valido = inventario.obtenerProductoPorPosicion(0);
        if (valido != null) {
            System.out.println("Producto encontrado: " + valido.getNombre());
        }

        System.out.println("\n===== Caso inválido: obtenerProductoPorPosicion =====");
        Producto p = inventario.obtenerProductoPorPosicion(99);
        if (p == null) {
            System.out.println("No se pudo obtener el producto");
        }

        System.out.println("\n===== Desafío creativo: obtenerProductoSeguro =====");
        Producto seguro = inventario.obtenerProductoSeguro(50);
        if (seguro == null) {
            System.out.println("No se pudo obtener el producto (revisa logs_inventario.txt)");
        }
    }
}