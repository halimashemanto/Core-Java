
package model;


public class Student {
    
    private int id;
    private String name;
    private String email;
    private String contactNo;
    private String subject;
    private String gender;

    public Student() {
    }

    public Student(int id, String name, String email, String contactNo, String subject, String gender) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.contactNo = contactNo;
        this.subject = subject;
        this.gender = gender;
    }

    public Student(String name, String email, String contactNo, String subject, String gender) {
        this.name = name;
        this.email = email;
        this.contactNo = contactNo;
        this.subject = subject;
        this.gender = gender;
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

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "StudentEntity{" + "id=" + id + ", name=" + name + ", email=" + email + ", contactNo=" + contactNo + ", subject=" + subject + ", gender=" + gender + '}';
    }

  
}
