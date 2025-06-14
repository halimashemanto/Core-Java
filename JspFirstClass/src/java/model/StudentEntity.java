
package model;


public class StudentEntity {
    
    private int id;
    private String name;
    private String email;
    private int contactNo;

    public StudentEntity() {
    }

    public StudentEntity(int id, String name, String email, int contactNo) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.contactNo = contactNo;
    }

    public StudentEntity(String name, String email, int contactNo) {
        this.name = name;
        this.email = email;
        this.contactNo = contactNo;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    @Override
    public String toString() {
        return "StudentEntity{" + "id=" + id + ", name=" + name + ", email=" + email + ", contactNo=" + contactNo + '}';
    }
    
    
}
