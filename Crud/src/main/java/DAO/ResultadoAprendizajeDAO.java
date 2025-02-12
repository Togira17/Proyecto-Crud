/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Clases.ResultadoAprendizaje;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * DAO para gestionar las operaciones CRUD de la entidad Resultado de Aprendizaje.
 */
public class ResultadoAprendizajeDAO {
    private Connection conexion;

    public ResultadoAprendizajeDAO(Connection conexion) {
        this.conexion = conexion;
    }

    /**
     * Obtiene todos los Resultados de Aprendizaje de la base de datos.
     * @return 
     * @throws java.sql.SQLException
     */
    public List<ResultadoAprendizaje> obtenerTodos() throws SQLException {
        List<ResultadoAprendizaje> lista = new ArrayList<>();
        String sql = "SELECT * FROM resultados_aprendizaje";
        try (Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new ResultadoAprendizaje(
                        rs.getInt("id"),
                        rs.getString("descripcion"),
                        rs.getInt("id_asignatura")));
            }
        }
        return lista;
    }

    /**
     * Agrega un nuevo Resultado de Aprendizaje a la base de datos.
     * @param resultado
     * @throws java.sql.SQLException
     */
    public void agregar(ResultadoAprendizaje resultado) throws SQLException {
        String sql = "INSERT INTO resultados_aprendizaje (descripcion, id_asignatura) VALUES (?, ?)";
        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setString(1, resultado.getDescripcion());
            pstmt.setInt(2, resultado.getIdAsignatura());
            pstmt.executeUpdate();
        }
    }

    /**
     * Elimina un Resultado de Aprendizaje por su ID.
     * @param id
     * @throws java.sql.SQLException
     */
    public void eliminar(int id) throws SQLException {
        String sql = "DELETE FROM resultados_aprendizaje WHERE id = ?";
        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        }
    }
}
