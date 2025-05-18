
package advancejava1stclass.util;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DbUtil {
   private java.sql.Connection con = null;
   private String url = "jdbc:mysql://localhost:3306/ss";
      private String user = "root";
   private String password = "1234";
   private String driver = "com.mysql.cj.jdbc.Driver";

    
    public Connection getCon(){
    
       try {
           Class.forName(driver);
           
           con = (Connection) DriverManager.getConnection(url, user, password);
       } catch (ClassNotFoundException ex) {
         
           Logger.getLogger(DbUtil.class.getName()).log(Level.SEVERE, null, ex);
           
           
       }
               return con;

    }
    
    
    
}
