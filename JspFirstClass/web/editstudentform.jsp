
<%@page import="model.Student" %>
<%@page import="Dao.StudentDao" %>


<%
    String id = request.getParameter("id");    
    Student s = StudentDao.getById(Integer.parseInt(id));

%>



<%@include file="header.jsp" %>

<div class="container my-3">
    <div class="bg-success text-center">
        <h1 class="jumborton">Update Student</h1>
    </div>
 
    <form action="editstudent.jsp"  method="post">
        <input type="hidden" name="id" value="<%=s.getId()%>" />

        <div class="row">
            <div class="col-md-6">
                <label for="exampleInputEmail1" class="form-label">Name</label>
                <input type="text" class="form-control" id="name" name="name" value="<%=s.getName()%>" >
            </div>

            <div class="col-md-6">
                <label for="exampleInputEmail1" class="form-label">Email</label>
                <input type="text" class="form-control" id="email" name="email" value="<%=s.getEmail()%>">
            </div>        
        </div>
    
        <div class="row mt-3">
            <div class="col-md-6">
                <label  class="form-label">Subject</label>
                <select class="form-select" name="subject" aria-label="Default select example">
                    <option disabled>Select Anyone</option>
                    <option value="Accounting" <%= "Accounting".equals(s.getSubject()) ? "selected" : "" %>>Accounting</option>
                    <option value="Management" <%= "Management".equals(s.getSubject()) ? "selected" : "" %>>Management</option>
                    <option value="Marketing" <%= "Marketing".equals(s.getSubject()) ? "selected" : "" %>>Marketing</option>
                    <option value="Finance" <%= "Finance".equals(s.getSubject()) ? "selected" : "" %>>Finance</option>
                </select>
            </div>

            <div class="col-md-6">
                <label for="exampleInputEmail1" class="form-label">Gender</label>
                <div class="form-check">
                    <input class="form-check-input" type="radio" value="Male" name="gender" id="flexRadioDefault1"
                           <%= "Male".equals(s.getGender()) ? "checked" : "" %>>
                    <label class="form-check-label" for="flexRadioDefault1">Male</label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" value="Female" name="gender" id="flexRadioDefault2"
                           <%= "Female".equals(s.getGender()) ? "checked" : "" %>>
                    <label class="form-check-label" for="flexRadioDefault2">Female</label>
                </div>
            </div>        
        </div>

        <div class="row">
            <div class="col-md-6">
                <label for="exampleInputEmail1" class="form-label">Contact Number</label>
                <input type="text" class="form-control" id="contactNo" name="contactNo" value="<%=s.getContactNo()%>" >
            </div>

        </div>

        <div class="row mt-3 text-center">
            <div class="col-md-6">
                <button type="submit" class="btn btn-success text-center" >Update</button>

            </div>

            <div class="col-md-6">
                <button type="reset" class="btn btn-danger text-center" >Reset</button>

            </div>
        </div>
    </form>

  
</div>


<%@include file="footer.jsp" %>