package Controladores;

import Modelos.cBaseDatos;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ServletVerifica", urlPatterns = {"/ServletVerifica"})
public class ServletVerifica extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            // Obtener el nombre de usuario y la contraseña de la solicitud HTTP
            String xnom = request.getParameter("xnom");
            String xcla = request.getParameter("xcla");
            // Crear un objeto de la clase BaseDatos para verificar el usuario
            cBaseDatos objDB = new cBaseDatos();
            if (objDB.validarUsuario(xnom, xcla)){
                // Si el usuario es válido, crear una sesión HTTP y guardar el nombre de usuario en ella
                HttpSession misession= request.getSession(true);
                misession.setAttribute("usuario",xnom.toUpperCase());
                // Redireccionar al usuario a la página de áreas del sitio web
                response.sendRedirect("/WebJava04/areas.jsp");
            }else
                // Si el usuario es inválido, redireccionar al usuario a la página de inicio de sesión del sitio web
                response.sendRedirect("/WebJava04/index.html");
        } finally { 
            out.close();
        }
    }

    // Métodos doGet y doPost que llaman al método processRequest para manejar las solicitudes HTTP GET y POST
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    // Método getServletInfo que devuelve una descripción corta del servlet
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
