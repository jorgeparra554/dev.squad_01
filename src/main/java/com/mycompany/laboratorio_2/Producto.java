/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio_2;

/**
 *
 * @author jorge
 */
public class Producto {
    
    private String nombre;
    private double precio;
    private int cantidad;
    private String codigo;

    public Producto(String nombre, double precio, int cantidad, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        
        if (precio < 0) {
            this.precio = 0.0;
        } else {
            this.precio = precio;
        }
        
        if (cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad = cantidad;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            this.precio = 0.0;
        } else {
            this.precio = precio;
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad = cantidad;
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
     
     