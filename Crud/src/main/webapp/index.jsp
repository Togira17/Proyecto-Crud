<%-- 
    Document   : index
    Created on : 12 feb 2025, 13:35:56
    Author     : DAW2
--%>

<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/styles.css">
    <title>Gestión Académica</title>
<!-- Bootstrap 5 - CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">

</head>
<body>
    <div class="container mt-5">
        <h1 class="text-center">Sistema de Gestión Académica</h1>
        <p class="text-center">Administra asignaturas, resultados de aprendizaje y criterios de evaluación.</p>

        <div class="row text-center mt-4">
            <div class="col-md-4">
                <a href="asignaturas.jsp" class="btn btn-primary btn-lg w-100">📚 Gestionar Asignaturas</a>
            </div>
            <div class="col-md-4">
                <a href="resultados.jsp" class="btn btn-secondary btn-lg w-100">🎯 Gestionar Resultados de Aprendizaje</a>
            </div>
            <div class="col-md-4">
                <a href="criterios.jsp" class="btn btn-success btn-lg w-100">✅ Gestionar Criterios de Evaluación</a>
            </div>
        </div>

        <footer class="text-center mt-5">
            <p>&copy; 2025 - Proyecto CRUD con JSP, MySQL y Bootstrap</p>
        </footer>
    </div>

<!-- Bootstrap 5 - JavaScript (Opcional si usas componentes interactivos) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
