<jsp:useBean class="model.Employee" id="e" />
 
<%@page import="dao.EmployeeDao" %>

<jsp:setProperty name="e" property="*" />

<%
    int result = EmployeeDao.saveAllEmployee(e); // Missing semicolon

    if(result > 0){  
        response.sendRedirect("index.jsp");
    } else {
        response.sendRedirect("error.jsp"); 
    }
%>
