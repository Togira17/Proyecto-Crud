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
 * Clase que representa un Criterio de Evaluación en el sistema de gestión académica.
 */
public class CriterioEvaluacion {
    private int id;
    private String criterio;
    private int idResultadoAprendizaje;

    /**
     * Constructor vacío.
     */
    public CriterioEvaluacion() {}

    /**
     * Constructor con parámetros.
     * @param id Identificador único del criterio de evaluación.
     * @param criterio Descripción del criterio de evaluación.
     * @param idResultadoAprendizaje ID del Resultado de Aprendizaje al que pertenece.
     */
    public CriterioEvaluacion(int id, String criterio, int idResultadoAprendizaje) {
        this.id = id;
        this.criterio = criterio;
        this.idResultadoAprendizaje = idResultadoAprendizaje;
    }

    // Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCriterio() {
        return criterio;
    }

    public void setCriterio(String criterio) {
        this.criterio = criterio;
    }

    public int getIdResultadoAprendizaje() {
        return idResultadoAprendizaje;
    }

    public void setIdResultadoAprendizaje(int idResultadoAprendizaje) {
        this.idResultadoAprendizaje = idResultadoAprendizaje;
    }
}