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

//EJERCICIO 2  SOBRECARGA DE CONSTRUCTORES.
    
//2.CONSTRUCTOR NOMBRE PRECIO Y CODIGO   
    public Producto(String nombre, double precio, String codigo) {
        this(nombre, precio, 0 , codigo);
    
    }
//3.CONSTRUCTOR NOMBRE y PRECIO

    public Producto(String nombre, double precio) {
        this (nombre, precio, 0,"PENDIENTE-"+(int)(Math.random()*1000));
    }
//4.CONSTRUCTOR VACIO  
    public Producto() {
        this ("",0.0,0,"");
    }
    
//EJERCICIO 3 SOBRECARGA DE METODOS
    public double aplicarDescuento (double porcentaje){
        if (porcentaje > 50){
            porcentaje= 50;
        }
        precio = precio - (precio * porcentaje/ 100);
        return precio;
    
    }
    
    public double aplicarDescuento(double montoFijo, boolean esFijo){
        if (montoFijo > precio) {
        montoFijo = precio;
        }
        precio = precio - montoFijo;
        return precio;
    }
    
    //EJERCICIO 4 LLAMADOS A METODOS INTERNOS 
    
    public double calcularValorInventario () {
        if (getCantidad() == 0){
            return 0.0;
        }
        return getPrecio() * getCantidad();
    
    }

    public double calcularValorConDescuento (double descuento){
        double valorInventario =  calcularValorInventario ();
        double valorDescuento = valorInventario * descuento / 100;
        return valorInventario - valorDescuento;
    }
    
    
    //METODO GETTER
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
     
     