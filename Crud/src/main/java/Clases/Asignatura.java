/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;


/**
 * Clase que representa una asignatura en el sistema de gestión académica.
 */
public class Asignatura {
    private int id;
    private String nombre;
    private String descripcion;

    /**
     * Constructor vacío.
     */
    public Asignatura() {}

    /**
     * Constructor con parámetros.
     * @param id Identificador único de la asignatura.
     * @param nombre Nombre de la asignatura.
     * @param descripcion Descripción de la asignatura.
     */
    public Asignatura(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    // Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

