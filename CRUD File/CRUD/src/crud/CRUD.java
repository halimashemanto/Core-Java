
package crud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbUtil;


public class CRUD {

    static String sql;
    static PreparedStatement ps;
    static DbUtil db = new DbUtil();
   
    public static void main(String[] args) {

        saveStudent("Shemanto", 12, "AA");
        System.out.println("After Save.");
        
        showAllStudent();
        System.out.println("-----------");

        updateStudent("Suprova", 5, "AAA", 1);
        System.out.println("After Update.");

         showAllStudent();
        System.out.println("-----------");

        deleteStudent(0);
        System.out.println("After Delete.");

         showAllStudent();





    }
   
    
    public static void saveStudent(String name,int classs,String section){
    sql ="insert into student(name,classs,section)values(?,?,?)";
    
        try {
            ps = db.getCon().prepareStatement(sql);
            
            ps.setString(1, name);
            ps.setInt(2, 10);
            ps.setString(3, section);
            
            System.out.println("Save Confirm.");
            System.out.println("----------------------");
            
            ps.executeUpdate();
            ps.close();
            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public static void showAllStudent(){
    sql = "select * from student";
    
        try {
            ps= db.getCon().prepareStatement(sql);
            
            ResultSet  rs = ps.executeQuery();
            
            while(rs.next()){
            
                String name = rs.getString("name");  
                int classs = rs.getInt("classs");
                String section = rs.getString("section");
                int id = rs.getInt("id");
                
                  System.out.println("Id : " + id +"\n"+ "Name : " + name +"\n"+ "Class : " + classs +"\n"+ "Section : " + section+"\n");

                
            }
           
            ps.executeQuery();
             ps.close();
             rs.close();
             db.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    
    
    public static void deleteStudent(int id) {

        sql = "delete from student where id=?";
       
        try {
            ps = db.getCon().prepareStatement(sql);
             ps.setInt(1, id);

            ps.executeUpdate();
            ps.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }
    
    
    
    
    public static void updateStudent( String name, int classs, String section,int id) {
        sql = "update student  set name=?, classs=?,section=? where id=?";

        
        try {
            ps = db.getCon().prepareStatement(sql);
           
            ps.setString(1, name);
            ps.setInt(2, classs);
            ps.setString(3, section);
             ps.setInt(4,id);
             
            ps.executeUpdate();
            
            ps.close();
            db.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
            

        

    }
    
    
}
