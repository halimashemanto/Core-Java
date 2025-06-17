<%@include file="header.jsp" %>

<div class="container my-3">
    <div class="bg-success text-center">
        <h1 class="jumborton">Include Employees Information</h1>
    </div>
    
    <form action="empServlet"  method="post">
        <input type="hidden" name="action" value="add">
        
        <div class="row">
            <div class="col-md-6">
                <label for="exampleInputEmail1" class="form-label">Name</label>
                <input type="text" class="form-control"  name="name" >
            </div>

            <div class="col-md-6">
                <label for="exampleInputEmail1" class="form-label">Email</label>
                <input type="text" class="form-control"  name="email" >
            </div>        
        </div>
         <div class="row">
            <div class="col-md-6">
                <label for="exampleInputEmail1" class="form-label">Salary</label>
                <input type="text" class="form-control"  name="salary" >
            </div>

                  
        </div>
        

        <div class="row mt-3 text-center">
            <div class="col-md-6">
                <button type="submit" class="btn btn-success text-center" >Save</button>

            </div>

            <div class="col-md-6">
                <button type="reset" class="btn btn-danger text-center" >Reset</button>

            </div>
        </div>
    </form>

</div>


<%@include file="footer.jsp" %>
