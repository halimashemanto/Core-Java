<jsp:useBean class="model.EmployeeEntity" id="e" />

<%@page import="dao.EmployeeDao" %>

<jsp:setProperty name="e" property="*" />

<%
    
        int result=EmployeeDao.saveAllEmployee(e)
        if(result > o){
            response.sendRedirect("index.jsp");
    
        }
        else{
            response.sendDirect("error.jsp");
       }
    
%>
