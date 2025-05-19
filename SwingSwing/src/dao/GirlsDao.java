package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import util.DBUtil;

public class GirlsDao {

    DBUtil util = new DBUtil();
    PreparedStatement ps;

    public void saveGirlsProduct(String dress, String cosmetics, String hairAccosories, String shoes) {

        String sql = "insert into girlsProducts(dress,cosmetics,hairAccosories,shoes)values(?,?,?,?)";
        try {
            ps = util.getCon().prepareStatement(sql);
            
            ps.setString(1, dress);
            ps.setString(2, cosmetics);
            ps.setString(3, hairAccosories);
            ps.setString(4, shoes);
            
            ps.executeUpdate();
            ps.close();
            
            util.getCon().close();
        
            JOptionPane.showMessageDialog(null, "Customer Saved Successfully.");
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(GirlsDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
