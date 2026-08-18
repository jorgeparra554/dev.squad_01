/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio_2;

/**
 *
 * @author Tatia
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class GestorArchivos {

    // File, FileWriter y BufferedWriter
    public static void guardarInventarioEnArchivo(ArrayList<Producto> inventario, String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        String fecha = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        // Desafío creativo: si el archivo ya existe, se crea un respaldo antes de sobrescribir
        if (archivo.exists()) {
            crearRespaldo(archivo);
        }

        // IOException
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            // Cabecera con la fecha de generación
            writer.write("// Fecha: " + fecha);
            writer.newLine();

            // Cada producto en una línea: codigo,nombre,precio,cantidad
            for (Producto p : inventario) {
                writer.write(p.toString());
                writer.newLine();
            }

            System.out.println("Inventario guardado exitosamente en " + nombreArchivo);

        } catch (IOException e) {
            System.out.println("Error al guardar el inventario: " + e.getMessage());
        }
    }

    // Crea una copia del archivo existente con fecha/hora antes de sobrescribirlo
    private static void crearRespaldo(File archivoOriginal) {
        String marcaTiempo = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));

        String nombreRespaldo = archivoOriginal.getName().replace(".txt", "")
                + "_respaldo_" + marcaTiempo + ".txt";

        try {
            Files.copy(archivoOriginal.toPath(), Paths.get(nombreRespaldo),
                    StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Respaldo creado: " + nombreRespaldo);
        } catch (IOException e) {
            System.out.println("No se pudo crear el respaldo: " + e.getMessage());
        }
    }
}