package dao;

import util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Emp;

public class EmpDao {

    static DbUtil db = new DbUtil();
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql = " ";

    public static List<Emp> getAllEmp() {

        List<Emp> emps = new ArrayList<>();
        sql = "select*from emp";

        try {
            ps = db.getCon().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Emp e = new Emp(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getDouble("salary")
                );
                emps.add(e);
            }
            ps.close();
            rs.close();
            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(EmpDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return emps;

    }

    public static int saveEmp(Emp e) {

        int status = 0;
        sql = "insert into emp(name,email,salary) values (?,?,?)";
        if (!(e.getName().isEmpty())) {

        }

        try {
            ps = db.getCon().prepareStatement(sql);

            ps.setString(1, e.getName());
            ps.setString(2, e.getEmail());
            ps.setDouble(3, e.getSalary());

            status = ps.executeUpdate();
            System.out.println(status);

            ps.close();
            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(EmpDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    public static int updateEmp(Emp e) {

        int status = 0;
        sql = "update emp set name = ?, email = ?, salary = ? where id = ?";

        try {
            ps = db.getCon().prepareStatement(sql);

            ps.setString(1, e.getName());
            ps.setString(2, e.getEmail());
            ps.setDouble(3, e.getSalary());
            ps.setInt(4, e.getId());

            status = ps.executeUpdate();

            ps.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(EmpDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    public static void deleteEmp(int id) {

        sql = "delete from emp where id = ?";

        try {
            ps = db.getCon().prepareStatement(sql);
            ps.setInt(1, id);

            ps.executeUpdate();

            ps.close();
            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(EmpDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Emp getById(int id) {

        Emp e = null;

        sql = "select * from emp where id = ?";
               

        try {
            ps = db.getCon().prepareStatement(sql);

            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                e = new Emp(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getDouble("salary")
                );

            }

            ps.close();
            rs.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(EmpDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return e;
    }

}
