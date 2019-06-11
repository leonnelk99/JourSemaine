<%-- 
    Document   : result
    Created on : 5 juin 2019, 22:56:32
    Author     : LEONNEL SOFT
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
       String valeur = (String)request.getAttribute("valeur");
        //out.println (valeur);
        %>
          <h1> le numeros  = <%= valeur%> </h1>
    
            <a href="http://localhost:8080/JourSemaine/Calculer?"> back </a>
       
     
    </body>
</html>
