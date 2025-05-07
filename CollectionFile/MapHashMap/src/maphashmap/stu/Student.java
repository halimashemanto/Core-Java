
package maphashmap.stu;


public class Student {
    private String name;
    private int age;
    private int id;
    private String email;

    public Student() {
    }

    public Student(String name, int age, int id, String email) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", id=" + id + ", email=" + email + '}';
    }
    
    
}
