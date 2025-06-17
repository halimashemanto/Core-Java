package servelet;

import dao.EmpDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import model.Emp;

@WebServlet("/empServlet")
public class EmpServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");

        if ("add".equals(action)) {

            Emp emp = new Emp();
            emp.setName(request.getParameter("name"));
            emp.setEmail(request.getParameter("email"));
            emp.setSalary(Double.parseDouble(request.getParameter("salary")));

            EmpDao.saveEmp(emp);

            response.sendRedirect("index.jsp");
        } else if ("update".equals(action)) {

            Emp emp = new Emp();
            emp.setId(Integer.parseInt(request.getParameter("id")));
            emp.setName(request.getParameter("name"));
            emp.setEmail(request.getParameter("email"));
            emp.setSalary(Double.parseDouble(request.getParameter("salary")));

            System.out.println(emp);
            EmpDao.updateEmp(emp);

            response.sendRedirect("index.jsp");

        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");

        if ("delete".equals(action)) {
            EmpDao.deleteEmp(Integer.parseInt(request.getParameter("id")));
            response.sendRedirect("index.jsp");

        } else if ("edit".equals(action)) {
            Emp e = EmpDao.getById(Integer.parseInt(request.getParameter("id")));
            System.out.println(request.getParameter("id"));
            request.setAttribute("emp", e);
            request.getRequestDispatcher("editempform.jsp").forward(request, response);                            
        }

    }

}
