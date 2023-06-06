<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" 
              href="webjars/bootstrap/5.2.3/css/bootstrap.min.css" type="text/css" />
    </head>
    <body>
        <div class="container mt-5">

            <div class="alert alert-info" role="alert">
                <%
                    String xusu = request.getParameter("xusu");
                    String xpas = request.getParameter("xpas");
                    
                    if(xusu.equals("felix")){
                    
                        if(xpas.equals("123456789")){
                    
                            	
                            response.setHeader("Refresh", "0; URL=servlets.html");//Abrir
                        
                        }else{out.print("La contraseña es incorrecta");}
                        
                    }else{out.print("El usuario es incorrecto");}
                   
                %>
            </div>
            <div class="alert alert-dark" role="alert">
                <a class="btn btn-primary" href="index.html" role="button">Volver a enviar datos</a>
            </div>
        </div>
    </body>
</html>
