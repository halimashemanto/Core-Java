
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.EmployeeEntity;
import util.DbUtil;

public class EmployeeDao {
    
    
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql ;
    
    
    public static  List<EmployeeEntity> getAllEmployee(){
      List<EmployeeEntity> employees = new ArrayList<>();
      
        sql = "select * from employee";
        
        try {
            ps= DbUtil.getCon().prepareStatement(sql);
            
            rs = ps.executeQuery();
            
            while(rs.next()){
            
            EmployeeEntity e = new EmployeeEntity(
            
            rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("designation"),
                    rs.getDouble("salary")
            
            
            );
            employees.add(e);
            
            
            }
            
            rs.close();
            ps.close();
            DbUtil.getCon().close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return employees;
    }
    
    
       public static int saveAllEmployee(EmployeeEntity e){
    int status =0;
    sql ="insert into employee(name,designation,salary)values(?,?,?)";
    
        try {
            ps = DbUtil.getCon().prepareStatement(sql);
            
            
            ps.setString(1,e.getName());
            ps.setString(2,e.getDesignation());
            ps.setDouble(3, e.getSalary());
            
            status = ps.executeUpdate();
            
            System.out.println(status);
            
            ps.close();
            DbUtil.getCon().close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return status;
    }
 
    
    
}
