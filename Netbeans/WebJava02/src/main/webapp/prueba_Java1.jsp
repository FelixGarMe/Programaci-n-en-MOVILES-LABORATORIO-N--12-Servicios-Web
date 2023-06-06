<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>
<%@ page import="com.miempresa.webjava02.Calculo" %>
<%@ page import="com.miempresa.webjava02.Utilidades" %>
<%! String cadena = "Bienvenidos a JSP";%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <link rel="stylesheet" 
              href="webjars/bootstrap/5.1.0/css/bootstrap.min.css" type="text/css" />
        <title>JSP Page</title>
        
    </head>
    <body>
        <div class="container mt-5">
            <div class="row">

                <!--Columna 1-->
                <div class="col">
                    <div class="card text-dark bg-warning mb-3" style="max-width: 18rem;">
                        <div class="card-header">Declaración de variable</div>
                        <div class="card-body">
                            <h5 class="card-title">Variable cadena</h5>
                            <p class="card-text"><%= cadena%></p>
                        </div>
                    </div>
                </div>
                        
                <!--Columna 2-->
                <div class="col">
                    <div class="card text-dark bg-info mb-3" style="max-width: 18rem;">
                        <div class="card-header">Uso de libreria Date</div>
                        <div class="card-body">
                            <h5 class="card-title">Fecha Actual</h5>
                            <p class="card-text"><% out.println(new Date());%></p>
                        </div>
                    </div>
                </div>
                
                <!--Columna 3 (2 Alterada)-->                        
                <div class="col">
                    <div class="card text-dark bg-info mb-3" style="max-width: 18rem;">
                        <div class="card-header">Uso de libreria Date</div>
                        <div class="card-body">
                            <h5 class="card-title">Fecha Actual</h5>
                            <p class="card-text"><% System.out.println(new Date());%></p>
                        </div>
                    </div>
                </div>
                        
                        
                <!--Columna 4-->
                <div class="col">
                    <div class="card text-dark bg-info mb-3" style="max-width: 18rem;">
                        <div class="card-header">Invocación de clase Calculo</div>
                        <div class="card-body">
                            
                            
                            <h5 class="card-title">Uso de clase</h5>
                            <p class="card-text">
                                
                                
                               
                                
                                <%
                                    
                                    Calculo obj = new Calculo();
                                    int men = obj.menor(10, 20);
                                    int may = obj.mayor(10, 20);
                                    out.print("Menor: " + men + "<p>");
                                    out.print("Mayor: " + may + "<p>");
                                %>
                            </p>
                            
                            
                        <form method="post" action="">
                            <label for="numero">Ingresa un número :</label>
                            <input type="text" name="numero" id="numero">
                            
                            
                            <br><button type="submit" name="sumar" value="true">Mayor</button>
                        
                        </form>

                        <%
                            if (request.getParameter("sumar") != null) {
                               int numero = Integer.parseInt(request.getParameter("numero"));
                               
                               int numero2 = 20;
                               int numero3 = 15;

                               int mayor = Utilidades.mayor(numero, numero2, numero3);

                               out.println("El mayor de los tres es: " + mayor);
                        }
                        %>
                            
                            
                            
                        </div>
                    </div>
                </div>

                        
                        
                        
                        
            </div>
        </div>
    </body>
</html>
