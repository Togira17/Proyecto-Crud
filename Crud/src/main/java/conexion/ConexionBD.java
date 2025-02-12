/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/gestion_academica";
    private static final String USER = "root";  // Asegúrate de que es tu usuario correcto
    private static final String PASSWORD = "";     // Si tu MariaDB tiene contraseña, colócala aquí

    public static Connection obtenerConexion() {
        Connection conexion = null;
        try {
            // Cargar el driver de MariaDB
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ Conexión establecida con éxito a MySql.");
        } catch (ClassNotFoundException e) {
            System.err.println("❌ Error: No se encontró el driver de MySql.");
        } catch (SQLException e) {
            System.err.println("❌ Error al conectar a la base de datos: " + e.getMessage());
        }
        return conexion;
    }
}