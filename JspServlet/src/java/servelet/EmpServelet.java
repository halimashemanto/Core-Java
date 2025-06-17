
package servelet;



import dao.EmpDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import model.Emp;




@WebServlet("/empServlet");
public class EmpServelet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {

        String action = request.getParameter("action");
        
        if("add".equals(request)){
        
        Emp emp = new Emp();
        emp.setName(request.getParameter("name"));
        emp.setEmail(request.getParameter("email"));
        emp.setSalary(Double.parseDouble(request.getParameter("salary")));
        
            EmpDao.saveEmp(emp);
        }
        
        else if(){
        
        }
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        
        super.doGet(req, resp); 
    }
    
    
}
