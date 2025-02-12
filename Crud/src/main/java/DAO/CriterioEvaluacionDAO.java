/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Clases.CriterioEvaluacion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * DAO para gestionar las operaciones CRUD de la entidad Criterio de Evaluación.
 */
public class CriterioEvaluacionDAO {
    private Connection conexion;

    public CriterioEvaluacionDAO(Connection conexion) {
        this.conexion = conexion;
    }

    /**
     * Obtiene todos los Criterios de Evaluación de la base de datos.
     * @return 
     * @throws java.sql.SQLException
     */
    public List<CriterioEvaluacion> obtenerTodos() throws SQLException {
        List<CriterioEvaluacion> lista = new ArrayList<>();
        String sql = "SELECT * FROM criterios_evaluacion";
        try (Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new CriterioEvaluacion(
                        rs.getInt("id"),
                        rs.getString("criterio"),
                        rs.getInt("id_resultado_aprendizaje")));
            }
        }
        return lista;
    }

    /**
     * Agrega un nuevo Criterio de Evaluación a la base de datos.
     * @param criterio
     * @throws java.sql.SQLException
     */
    public void agregar(CriterioEvaluacion criterio) throws SQLException {
        String sql = "INSERT INTO criterios_evaluacion (criterio, id_resultado_aprendizaje) VALUES (?, ?)";
        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setString(1, criterio.getCriterio());
            pstmt.setInt(2, criterio.getIdResultadoAprendizaje());
            pstmt.executeUpdate();
        }
    }

    /**
     * Elimina un Criterio de Evaluación por su ID.
     * @param id
     * @throws java.sql.SQLException
     */
    public void eliminar(int id) throws SQLException {
        String sql = "DELETE FROM criterios_evaluacion WHERE id = ?";
        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        }
    }
}
