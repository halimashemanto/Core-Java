<%@include file="header.jsp" %>

<div>
    
    <div class="text-center">
        <h1 class="jumborton">Include New Student</h1>
    </div>
    
    
    
    <form action="addstudent.jsp"  method="post">
        
        
            <div>
                <label for="exampleInputEmail1" class="form-label">Name</label>
                <input type="text" class="form-control" id="name" name="name" >
            </div>
        
        
        

            <div>
                <label for="exampleInputEmail1" class="form-label">Email</label>
                <input type="text" class="form-control" id="email" name="email" >
            </div>        
       
        
     
            <div>
              <label for="exampleInputEmail1" class="form-label">Contact Number</label>
                <input type="double" class="form-control" id="contactNo" name="contactNo" >  

            </div>
        
       
          <div>
                <button type="submit" class="btn btn-success text-center" >Save</button>

          </div> <p></p>
                
                

            <div>
                <button type="reset" class="btn btn-danger text-center" >Reset</button>

            </div>
        
        
        
        
    </form>

  
</div>


<%@include file="footer.jsp" %>