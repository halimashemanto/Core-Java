<jsp:useBean class="model.Student" id="d" />
<%@page  import="Dao.StudentDao" %>
<jsp:setProperty  name="d" property="*" />

<%
        
      StudentDao.deleteStudent(d.getId());
       
      response.sendRedirect("index.jsp");
    
           


%>
