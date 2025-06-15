<%@include file="header.jsp" %>

<div>

    <div class="text-center">
        <h1 class="jumborton">Include New Student</h1>
    </div>



    <form action="addstudent.jsp"  method="post">
        <div class="row mt-3">
            <div class="col-md-6">


                <label for="exampleInputEmail1" class="form-label">Name</label>
                <input type="text" class="form-control" id="name" name="name" >
            </div>


        </div>

        <div class="row mt-3">
            <div class="col-md-6">
                <label for="exampleInputEmail1" class="form-label">Email</label>
                <input type="text" class="form-control" id="email" name="email" >
            </div>        

        </div>

        <div class="row mt-3">
            <div class="col-md-6">


                <label for="exampleInputEmail1" class="form-label">Contact Number</label>
                <input type="double" class="form-control" id="contactNo" name="contactNo" >  

            </div>
        </div>

        <div class="row mt-3">
            <div class="col-md-6">
                <label  class="form-label">Subject</label>
                <select class="form-select" name="subject" aria-label="Default select example">
                    <option selected>Select Anyone</option>
                    <option value="Accounting">Accounting</option>
                    <option value="Management">Management</option>
                    <option value="Marketing">Marketing</option>
                    <option value="Finance">Finance</option>
                </select>
            </div>

            <div class="col-md-6">
                <label for="exampleInputEmail1" class="form-label">Gender</label>
                <div class="form-check">
                    <input class="form-check-input" type="radio" value="Male" name="gender" id="flexRadioDefault1">
                    <label class="form-check-label" for="flexRadioDefault1">
                        Male
                    </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" value="Female" name="gender" id="flexRadioDefault2" >
                    <label class="form-check-label" >
                        Female
                    </label>
                </div>
            </div>        
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