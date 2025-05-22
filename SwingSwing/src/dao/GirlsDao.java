package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
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

        

    public void editGirlsProduct(int list, String dress, String cosmetics, String hairAccosories, String shoes, JTable jt) {

        String sql = "update girlsProduct set dress=?, cosmetics=?, hairAccosories=?, shoes=? where list=? ";

        try {
            PreparedStatement ps = util.getCon().prepareStatement(sql);

            ps = util.getCon().prepareStatement(sql);
            ps.setString(1, dress);
            ps.setString(2, cosmetics);
            ps.setString(3, hairAccosories);
            ps.setString(4, shoes);
            ps.setInt(5, list);

            ps.executeUpdate();

            ps.close();
            util.getCon().close();

            JOptionPane.showMessageDialog(null, "Customer Updated Successfully");
            showAllCustomer(jt);
        } catch (SQLException ex) {
            Logger.getLogger(GirlsDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void deleteGirlsProduct(int id, JTable jt) {

        String sql = "delete from customer where id=?";

        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setInt(1, id);

            ps.executeUpdate();

            ps.close();
            util.getCon().close();

            JOptionPane.showMessageDialog(null, "Customer Delete Successfully");
            showAllGirlsProduct(jt);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Customer Saved not Successfull");
            Logger.getLogger(GirlsDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
