package practicecrud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbUtil;

public class PracticeCRUD {

    static String sql;
    static PreparedStatement ps;
    static DbUtil db = new DbUtil();

    public static void main(String[] args) {
        saveEmp("sss", "djfcndjkx@gamil.com", 20000);
        System.out.println("After Save.");

        showAllEmp();
        System.out.println("-----------");

        updateEmp("kbc", "sdcmd@gmail.com", 2656260, 3);
        System.out.println("After Update.");

        showAllEmp();
        System.out.println("-----------");

        deleteEmp(0);
        System.out.println("After Delete.");

        showAllEmp();
    }

    public static void saveEmp(String name, String designation, double salary) {
        sql = "insert into employee(name,designation,salary)values(?,?,?)";
        try {
            ps = db.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, designation);
            ps.setDouble(3, salary);

            System.out.println("Save Confirm.");
            System.out.println("----------------------");

            ps.executeUpdate();
            
            ps.close();

            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(PracticeCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void showAllEmp() {
        sql = "select * from employee ";
        try {
            ps = db.getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                String designation = rs.getString("designation");
                double salary = rs.getDouble("salary");
                int id = rs.getInt("id");

                System.out.println("Id : " + id + "\n" + "Name : " + name + "\n"
                        + "Email : " + designation + "\n" + "Salary : " + salary + "\n");

            }

            ps.executeQuery();
            ps.close();

            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(PracticeCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void deleteEmp(int id) {
        sql = "delete from employee where id = ?";
        try {
            ps = db.getCon().prepareStatement(sql);
            ps.setInt(1, id);

            ps.executeUpdate();
            ps.close();

            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(PracticeCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void updateEmp(String name, String designation, double salary, int id) {
        sql = "update employee set name=?,designation=?,salary=? where id=?";
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
            Logger.getLogger(PracticeCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
