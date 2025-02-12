/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Clases.Asignatura;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * DAO para gestionar las operaciones CRUD de la entidad Asignatura.
 */
public class AsignaturaDAO {
    private Connection conexion;

    public AsignaturaDAO(Connection conexion) {
        this.conexion = conexion;
    }

    /**
     * Obtiene todas las asignaturas de la base de datos.
     * @return 
     * @throws java.sql.SQLException
     */
    public List<Asignatura> obtenerTodas() throws SQLException {
        List<Asignatura> lista = new ArrayList<>();
        String sql = "SELECT * FROM asignaturas";
        try (Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new Asignatura(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("descripcion")));
            }
        }
        return lista;
    }

    /**
     * Agrega una nueva asignatura a la base de datos.
     * @param asignatura
     * @throws java.sql.SQLException
     */
    public void agregar(Asignatura asignatura) throws SQLException {
        String sql = "INSERT INTO asignaturas (nombre, descripcion) VALUES (?, ?)";
        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setString(1, asignatura.getNombre());
            pstmt.setString(2, asignatura.getDescripcion());
            pstmt.executeUpdate();
        }
    }

    /**
     * Elimina una asignatura por su ID.
     * @param id
     * @throws java.sql.SQLException
     */
    public void eliminar(int id) throws SQLException {
        String sql = "DELETE FROM asignaturas WHERE id = ?";
        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        }
    }
}
