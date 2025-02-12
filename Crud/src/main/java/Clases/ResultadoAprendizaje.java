/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author DAW2
 */
/**
 * Clase que representa un Resultado de Aprendizaje en el sistema de gestión académica.
 */
public class ResultadoAprendizaje {
    private int id;
    private String descripcion;
    private int idAsignatura; // Relación con la asignatura

    /**
     * Constructor vacío.
     */
    public ResultadoAprendizaje() {}

    /**
     * Constructor con parámetros.
     * @param id Identificador único del Resultado de Aprendizaje.
     * @param descripcion Descripción del Resultado de Aprendizaje.
     * @param idAsignatura ID de la asignatura a la que pertenece.
     */
    public ResultadoAprendizaje(int id, String descripcion, int idAsignatura) {
        this.id = id;
        this.descripcion = descripcion;
        this.idAsignatura = idAsignatura;
    }

    // Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(int idAsignatura) {
        this.idAsignatura = idAsignatura;
    }
}
