

package com.servlet;

import com.model.Jour;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Calculer extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        this.getServletContext().getRequestDispatcher("/WEB-INF/Views/form.jsp").forward(request, response);
        
    }

   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int jour = Integer.parseInt(request.getParameter("nombre"));
        
        Jour jours = new Jour();
        
    String valeur=  jours.afficher(jour);
        
    request.setAttribute("valeur", valeur);
        
         this.getServletContext().getRequestDispatcher("/WEB-INF/Views/result.jsp").forward(request, response);
       
    }

   
   
}
