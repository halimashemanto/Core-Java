<%@include file="header.jsp" %>

<div>
    
    <div class="text-center">
        <h1 class="jumborton">Include Employee</h1>
    </div>
    
    
    
    <form action="addemployeee.jsp"  method="post">
        
        
            <div>
                <label for="exampleInputEmail1" class="form-label">Name</label>
                <input type="text" class="form-control" id="name" name="name" >
            </div>
        
        
        

            <div>
                <label for="exampleInputEmail1" class="form-label">Designation</label>
                <input type="text" class="form-control" id="designtion" name="designation" >
            </div>        
       
        
     
            <div>
              <label for="exampleInputEmail1" class="form-label">Salary</label>
                <input type="double" class="form-control" id="salary" name="salary" >  

            </div>
        
       
          <div>
                <button type="submit" class="btn btn-success text-center" >Save</button>

            </div> < br>   
                
                

            <div>
                <button type="reset" class="btn btn-danger text-center" >Reset</button>

            </div>
        
        
        
        
    </form>

  
</div>


<%@include file="footer.jsp" %>
