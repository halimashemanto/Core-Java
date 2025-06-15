
package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Student;
import util.DbUtil;



public class StudentDao {
    static DbUtil db=new DbUtil();
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;
    
    public static List<Student> getAllStudent(){
    
    List<Student> students = new ArrayList<>();
    sql = "select * from student";
    
    ps = db.getCon().prepareStatement(sql);
    }
    
    
    
    
}
