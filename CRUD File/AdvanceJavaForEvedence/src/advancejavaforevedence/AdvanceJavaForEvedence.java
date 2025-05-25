package advancejavaforevedence;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbUtil;

public class AdvanceJavaForEvedence {

    static DbUtil du = new DbUtil();
    static PreparedStatement ps;
    static String sql = "";

    public static void main(String[] asd) {

        saveEmp("Shemanto", "shemanto@gmail.com", 10000);
        System.out.println("After Save.");

        showAllEmp();
        System.out.println("-----------");

        updateEmp(1, "Suprova", "suprova@gmail.com", 200000);
        System.out.println("After Update.");

        showAllEmp();
        System.out.println("-----------");

        deleteEmp(2);
        System.out.println("After Delete.");

        showAllEmp();

    }

    public static void saveEmp(String name, String email, double salary) {
        sql = "insert into emp(name,email,salary)values(?,?,?)";

        try {
            ps = du.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setDouble(3, salary);

            System.out.println("Save Successfully.");
            System.out.println("---------------------");

            ps.executeUpdate();

            ps.close();

            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(AdvanceJavaForEvedence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void showAllEmp() {
        sql = "select*from emp";
        try {
            ps = du.getCon().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                double salary = rs.getDouble("salary");

                System.out.println("Id : " + id + "Name : " + name + "E-mail : " + email + "Salary : " + salary);

            }

            ps.executeQuery();
            ps.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(AdvanceJavaForEvedence.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void deleteEmp(int id) {

        sql = "delete from emp where id=?";
        try {
            ps = du.getCon().prepareStatement(sql);
            ps.setInt(1, id);

            ps.executeUpdate();
            ps.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(AdvanceJavaForEvedence.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void updateEmp(int id, String name, String email, double salary) {
        sql = "update emp set id=?, name=?, email=?,salary=?";

        try {
            ps = du.getCon().prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, email);
            ps.setDouble(4, salary);

            ps.executeUpdate();
            ps.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(AdvanceJavaForEvedence.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
