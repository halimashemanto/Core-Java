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

        public void editGirlsProduct(int list, String dress,String cosmetics,String hairAccosories,String shoes, JTable jt) {
      
       
            

        
              String sql = "update girlsProduct set dress=?, cosmetics=?, hairAccosories=?, shoes=? where list=? ";

       
        try {
            PreparedStatement ps = util.getCon().prepareStatement(sql);
            
           ps = util.getCon().prepareStatement(sql);
            ps.setString(1, dress);
            ps.setString(2, cosmetics   );
            ps.setString(3, email);
            ps.setString(4, address);
            ps.setInt(5, id);

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

    public void editGirlsProduct(int id, String name, String email, String cell, String address, JTable jt) {

        String sql = "update customer set name=?, cell=?, email=?, address=? where id=? ";
        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, cell);
            ps.setString(3, email);
            ps.setString(4, address);
            ps.setInt(5, id);

            ps.executeUpdate();

            ps.close();
            util.getCon().close();

            JOptionPane.showMessageDialog(null, "Customer Updated Successfully");
            showAllGirlsProduct(jt);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Customer Saved not Successfull");
            Logger.getLogger(GirlsDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
   
       public void findCustomerByAddressToTable(String address, JTable jt) {
        
        String[] columnsName = {"ID", "Name", "Email", "Cell", "Address"};
        DefaultTableModel tableModel = new DefaultTableModel(columnsName, 0);
        jt.setModel(tableModel);

        String sql = "select * from customer where address=?";

        try {
            ps = util.getCon().prepareStatement(sql);

            ps.setString(1, address);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                tableModel.addRow(new Object[]{
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("email"),
                    rs.getString("cell"),
                    rs.getString("address")}
                ); 
            }

            rs.close();
            ps.close();
            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(GirlsDao.class.getName()).log(Level.SEVERE, null, ex);
        }


    
    
    
    
    
}
}
