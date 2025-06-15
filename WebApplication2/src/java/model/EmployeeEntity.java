
package model;

public class EmployeeEntity {
    private int id;
    private String name;
    private String designation;
    private double salary;

    public EmployeeEntity() {
    }

    public EmployeeEntity(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public EmployeeEntity(String name, String designation, double salary) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" + "id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary + '}';
    }
    
   
}
