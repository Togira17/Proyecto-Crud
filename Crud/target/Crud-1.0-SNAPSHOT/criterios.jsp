<%-- 
    Document   : criterios
    Created on : 12 feb 2025, 13:50:44
    Author     : DAW2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="Clases.CriterioEvaluacion" %>
<%@ page import="DAO.CriterioEvaluacionDAO" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="conexion.ConexionBD" %>

<%
    Connection conexion = ConexionBD.obtenerConexion();
    CriterioEvaluacionDAO dao = new CriterioEvaluacionDAO(conexion);
    List<CriterioEvaluacion> criterios = dao.obtenerTodos();
%>

<!DOCTYPE html>
<html lang="es">
<head>
    <title>Gestión de Criterios de Evaluación</title>
<!-- Bootstrap 5 - CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="css/styles.css"/>

</head>
<body>
    <div class="container mt-4">
        <h2 class="text-center">Gestión de Criterios de Evaluación</h2>

        <table class="table table-bordered table-striped">
            <thead class="table-dark">
                <tr>
                    <th>ID</th>
                    <th>Criterio</th>
                    <th>Resultado de Aprendizaje</th>
                </tr>
            </thead>
            <tbody>
                <% for (CriterioEvaluacion criterio : criterios) { %>
                    <tr>
                        <td><%= criterio.getId() %></td>
                        <td><%= criterio.getCriterio() %></td>
                        <td><%= criterio.getIdResultadoAprendizaje() %></td>
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
