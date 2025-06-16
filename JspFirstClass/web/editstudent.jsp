<jsp:useBean class="model.Student"  id="es" />
<%@page  import="Dao.StudentDao" %>
<jsp:setProperty  name="es" property="*" />

<%
        
        int result=StudentDao.updateStudent(es);
        if(result > 0){
             response.sendRedirect("index.jsp");
    
    }
        else{
             response.sendRedirect("error.jsp");
    }


%>