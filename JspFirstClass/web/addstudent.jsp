<jsp:useBean class="model.Student" id="ads" />
 
<%@page import="dao.StudentDao" %>

<jsp:setProperty name="ads" property="*" />

<%
    int result = EmployeeDao.saveAllEmployee(ads); // Missing semicolon

    if(result > 0){  
        response.sendRedirect("index.jsp");
    } else {
        response.sendRedirect("error.jsp"); 
    }
%>