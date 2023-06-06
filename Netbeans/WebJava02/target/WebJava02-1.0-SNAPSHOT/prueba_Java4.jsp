<%-- 
    Document   : prueba_Java4.jsp
    Created on : 1 abr. 2023, 20:02:07
    Author     : Felix Gar_Me
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <% 
      
      int num = 50;
      boolean esPrimo = true;

      // Comenzamos a comprobar si cada número menor que "num" es primo
      for (int i = 2; i <= num; i++) {
         esPrimo = true;

         // Comprobamos si "i" es divisible por algún número entre 2 e "i"/2
         for (int j = 2; j <= i/2; j++) {
            if (i % j == 0) {
               esPrimo = false;
               break;
            }
         }

         // Si no ha sido posible encontrar ningún divisor, "i" es primo
         if (esPrimo) {
            out.print(i + "<br>");
         }
      }
        %>
    </body>
</html>
