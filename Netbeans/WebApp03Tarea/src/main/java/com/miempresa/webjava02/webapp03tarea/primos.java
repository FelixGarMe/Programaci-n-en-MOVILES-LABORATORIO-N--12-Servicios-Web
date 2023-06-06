package com.miempresa.webjava02.webapp03tarea;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "primos", urlPatterns = {"/primos"})//DIRECTORIO
public class primos extends HttpServlet {

protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("<link rel=\"stylesheet\" \n"
                + "              href=\"webjars/bootstrap/5.2.3/css/bootstrap.min.css\" type=\"text/css\" />");
        try {
            
            String N = request.getParameter("n");
            int n =  Integer.parseInt(N);
            
            out.print("<div class='container'>");
            out.print("<div class=\"card\" style=\"width: 18rem;\">\n"
                    + "  <div class=\"card-body\">\n"
                    + "    <h5 class=\"card-title\">Suma de parametros</h5>\n"
                    + "    <p class=\"card-text\">"
                    );
                    
        for (int i = 2; i <= n; i++) {
            boolean esPrimo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                out.print(i + "<br>");
            }
        }                    
            
            
            
            out.print("</p>\n"
                    + "    <a href=\"index.html\" class=\"btn btn-primary\">Volver</a>\n"
                    + "  </div>\n"
                    + "</div>");
            out.print("</div>");

            
            
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
