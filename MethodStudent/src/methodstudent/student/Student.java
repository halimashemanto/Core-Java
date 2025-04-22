package methodstudent.student;

public class Student {

    private String name;
    private String email;
    private String dateOfBirth;
    private int id;

    public Student() {
    }

    public Student(String name, String email, String dateOfBirth, int id) {
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void getStudentDetails(){
        System.out.println(
                "Name: " + this.name + "\n"
                + "Email: " + this.email + "\n"
                + "ID: " + this.id + "\n"
                + "DOB: " + this.dateOfBirth + "\n"
        );
    }
     

}
