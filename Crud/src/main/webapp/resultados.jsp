<%-- 
    Document   : resultados
    Created on : 12 feb 2025, 13:50:23
    Author     : DAW2
--%>

<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="Clases.ResultadoAprendizaje" %>
<%@ page import="DAO.ResultadoAprendizajeDAO" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="conexion.ConexionBD" %>

<%
    Connection conexion = ConexionBD.obtenerConexion();
    ResultadoAprendizajeDAO dao = new ResultadoAprendizajeDAO(conexion);
    List<ResultadoAprendizaje> resultados = dao.obtenerTodos();
%>

<!DOCTYPE html>
<html lang="es">
<head>
    <title>Gestión de Resultados de Aprendizaje</title>
<!-- Bootstrap 5 - CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="css/styles.css"/>

</head>
<body>
    <div class="container mt-4">
        <h2 class="text-center">Gestión de Resultados de Aprendizaje</h2>

        <table class="table table-bordered table-striped">
            <thead class="table-dark">
                <tr>
                    <th>ID</th>
                    <th>Descripción</th>
                    <th>Asignatura</th>
                </tr>
            </thead>
            <tbody>
                <% for (ResultadoAprendizaje ra : resultados) { %>
                    <tr>
                        <td><%= ra.getId() %></td>
                        <td><%= ra.getDescripcion() %></td>
                        <td><%= ra.getIdAsignatura() %></td>
                    </tr>
                <% } %>
            </tbody>
        </table>

        <a href="index.jsp" class="btn btn-secondary mt-3">Volver al Inicio</a>
    </div>
            <!-- Bootstrap 5 - JavaScript (Opcional si usas componentes interactivos) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
