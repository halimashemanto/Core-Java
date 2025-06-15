<%@taglib  prefix="z" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.Student"%>
<%@page import="Dao.StudentDao"%>
<%@page import="java.util.*"%>


<%@include file="header.jsp" %>


<%
 List<Student> list=StudentDao.getAllStudent();
 request.setAttribute("list",list);

%>

<div class="container">



    <h1 class="text-danger text-center">LIST OF STUDENTS </h1> 

    <table class="table table-striped">

        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>E-mail</th>
                <th>Contact Number</th>
                <th>Subject</th>
                <th>Gender</th>
                <th>Action</th>
            </tr>
        </thead>

        <tbody>
            <z:forEach items="${list}" var="s">
                <tr>
                    <td>${s.getId()}</td>
                    
                    <td>${s.getName()}</td>
                    <td>${s.getEmail()}</td>
                    <td>${s.getContactNo()}</td>
                    
                    <td>${s.getSubject()}</td>
                    <td>${s.getGender()}</td>
                    <td>
                        <a href="editstudentform.jsp?id=${s.id}" class="btn btn-primary">Edit</a>
                        
                        <a href="deletestudent.jsp?id=${s.id}" class="btn btn-danger"                           
                           onclick="return confirm('Do you want to update this student information?');">Delete</a>
                    </td>


                </tr>

            </z:forEach>

        </tbody>


    </table>

</div>


<%@include file="footer.jsp" %>