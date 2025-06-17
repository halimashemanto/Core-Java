<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.Emp"%>
<%@page import="dao.EmpDao"%>
<%@page import="java.util.*"%>

<%@include file="header.jsp" %>

<%
    List<Emp> list = EmpDao.getAllEmp();
    request.setAttribute("list", list);
%>

<div class="container my-5">
    <h1 class="text-primary text-center mb-4">Employees List</h1>

    <table class="table table-bordered table-hover">
        <thead class="table-dark">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Salary</th>

                <th>Action</th>
            </tr>
        </thead>
        <tbody>


            <s:forEach items="${list}" var="e">
                <tr>
                    <td>${e.getId()}</td>
                    <td>${e.getName()}</td>
                    <td>${e.getEmail()}</td>
                    <td>${e.getSalary()}</td>

                    <td>
                        <a href="empServlet?action=edit&id=${e.id}" class="btn btn-sm btn-primary">Edit</a>
                        <a href="empServlet?action=delete&id=${e.id}" class="btn btn-sm btn-danger"
                           onclick="return confirm('Do you want to delete this Employee information?');">Delete</a>
                    </td>
                </tr>
            </s:forEach>
        </tbody>
    </table>
</div>

<%@include file="footer.jsp" %>