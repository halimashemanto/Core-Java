package midexamadvancejava;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbUtil;

public class MidExamAdvanceJava {

    static DbUtil db = new DbUtil();
    static PreparedStatement ps;
    static String sql;

    public static void main(String[] args) {
        
        saveEmployee("Shemanto", "ggvhj", 50000);
        System.out.println("After Save.");
       showAllEmployee();
        System.out.println("------------------------");
        
        updateEmployee("suprova", "hjbbujsdhc", 040000, 2);
        System.out.println("After Update.");
        
        showAllEmployee();
        System.out.println("--------------");
        
        deleteEmployee(3);
         System.out.println("After Delete.");
        showAllEmployee();

    }

    public static void saveEmployee(String name, String designation, double salary) {
        sql = "insert into employee(name,designation,salary)values(?,?,?)";

        try {
            ps = db.getCon().prepareStatement(sql);
            
            ps.setString(1, name);
            ps.setString(2, designation);
            ps.setDouble(3, salary);

            System.out.println("Save Confirm.");
            System.out.println("---------------------------");

            ps.executeUpdate();

            ps.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(MidExamAdvanceJava.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    
      public static void showAllEmployee(){
      sql = "select * from employee";
      
        try {
            ps = db.getCon().prepareStatement(sql);
            
             ResultSet rs = ps.executeQuery();
          
          
          while(rs.next()){
          
          String name = rs.getString("name");
          String designation = rs.getString("designation");
          double salary = rs.getDouble("salary");
          int id = rs. getInt("id");
          
              System.out.println("Name : " + name + "\n" + "Designation : " + designation + "\n" + "Salary : " + salary + "\n" + "Id : " + id);
          
          
          }
           ps.executeQuery();
           
      
           rs.close();
            ps.close();
            db.getCon().close();
      
        } catch (SQLException ex) {
            Logger.getLogger(MidExamAdvanceJava.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      
      
      }
    
     public static void deleteEmployee(int id) {
        sql = "delete from employee where id = ?";
        try {
            ps = db.getCon().prepareStatement(sql);
             
            ps.setInt(1, id);
            
            ps.executeUpdate();
            
            ps.close();
            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(MidExamAdvanceJava.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
     }
       public static void updateEmployee(String name, String designation, double salary,int id) {
        sql = "update employee set name=?,designation=?,salary=? where id = ?";
        
        try {
            ps = db.getCon().prepareStatement(sql);
             ps.setString(1, name);
            ps.setString(2, designation);
            ps.setDouble(3, salary);
            ps.setInt(4, id);
            
             ps.executeUpdate();
            
            ps.close();
            db.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(MidExamAdvanceJava.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     
}
}