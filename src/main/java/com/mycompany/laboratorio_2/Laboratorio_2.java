/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laboratorio_2;

/**
 *
 * @author jorge
 */
public class Laboratorio_2 {

public static void main(String[] args) {
        Producto laptop = new Producto("Laptop Gaming", 1299.99, 10, "TECH-001");
        
        System.out.println("Codigo: " + laptop.getCodigo());
        System.out.println("Precio: $" + laptop.getPrecio());
    }
    }
