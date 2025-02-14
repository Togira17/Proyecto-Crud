<%-- 
    Document   : asignaturas
    Created on : 12 feb 2025, 13:50:08
    Author     : DAW2
--%>

<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="Clases.Asignatura" %>
<%@ page import="DAO.AsignaturaDAO" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="conexion.ConexionBD" %>

<%
    Connection conexion = ConexionBD.obtenerConexion();
    AsignaturaDAO dao = new AsignaturaDAO(conexion);
    List<Asignatura> asignaturas = dao.obtenerTodas();

    String mensaje = "";
    if (request.getParameter("accion") != null) {
        String accion = request.getParameter("accion");
        if (accion.equals("agregar")) {
            String nombre = request.getParameter("nombre");
            String descripcion = request.getParameter("descripcion");
            dao.agregar(new Asignatura(0, nombre, descripcion));
            mensaje = "Asignatura agregada correctamente.";
        } else if (accion.equals("eliminar")) {
            int id = Integer.parseInt(request.getParameter("id"));
            dao.eliminar(id);
            mensaje = "Asignatura eliminada correctamente.";
        }
        asignaturas = dao.obtenerTodas();
    }
%>

<!DOCTYPE html>
<html lang="es">
<head>
    <title>Gestión de Asignaturas</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="css/styles.css"/>
</head>
<body>
    <div class="container mt-4">
        <h2 class="text-center">Gestión de Asignaturas</h2>

        <% if (!mensaje.isEmpty()) { %>
            <div class="alert alert-success"><%= mensaje %></div>
        <% } %>

        <table class="table table-bordered table-striped">
            <thead class="table-dark">
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Descripción</th>
                    <th>Acciones</th>
                </tr>
            </thead>
            <tbody>
                <% for (Asignatura asignatura : asignaturas) { %>
                    <tr>
                        <td><%= asignatura.getId() %></td>
                        <td><%= asignatura.getNombre() %></td>
                        <td><%= asignatura.getDescripcion() %></td>
                        <td>
                            <form method="POST">
                                <input type="hidden" name="accion" value="eliminar">
                                <input type="hidden" name="id" value="<%= asignatura.getId() %>">
                                <button type="submit" class="btn btn-danger btn-sm">Eliminar</button>
                            </form>
                        </td>
                    </tr>
                <% } %>
            </tbody>
        </table>

        <h3>Agregar Asignatura</h3>
        <form method="POST">
            <input type="hidden" name="accion" value="agregar">
            <div class="mb-3">
                <label>Nombre:</label>
                <input type="text" name="nombre" class="form-control" required>
            </div>
            <div class="mb-3">
                <label>Descripción:</label>
                <input type="text" name="descripcion" class="form-control" required>
            </div>
            <button type="submit" class="btn btn-primary">Agregar</button>
        </form>

        <a href="index.jsp" class="btn btn-secondary mt-3">Volver al Inicio</a>
    </div>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
