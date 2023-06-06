<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>

<!DOCTYPE html>
<html>
<head>
    <title>Lista de cargos</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Enlace a Bootstrap -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <h1 class="my-4">Listado de cargos</h1>
        <table class="table table-striped table-bordered">
            <thead class="thead-dark">
                <tr>
                    <th scope="col">Código</th>
                    <th scope="col">Nombre</th>
                    <th scope="col">Cargo</th>
                    <th scope="col">Estado</th>
                </tr>
            </thead>
            <tbody>
                <% 
                    String driver = "com.mysql.cj.jdbc.Driver";
                    String url   = "jdbc:mysql://localhost:8000/test?useSSL=false&serverTimezone=UTC";
                    String user   = "root";
                    String pass   = "123456789";
                    
                    Class.forName(driver);
                    Connection xcon = DriverManager.getConnection(url, user, pass);
                    
                    String sql = "select * from cargos";
                    Statement stm = xcon.createStatement();
                    ResultSet rs = stm.executeQuery(sql);
                    
                    while (rs.next()) {
                        out.print("<tr>");
                        out.print("<td>" + rs.getString(1) + "</td>");
                        out.print("<td>" + rs.getString(2) + "</td>");
                        out.print("<td>" + rs.getString(3) + "</td>");
                        out.print("<td>" + rs.getString(4) + "</td>");
                        out.print("</tr>");
                    }
                    
                    rs.close();
                    stm.close();
                    xcon.close();
                %>
            </tbody>
        </table>
    </div>
    <!-- Scripts de Bootstrap -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.1/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
