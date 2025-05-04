
package shemanto24.sub;

import shemanto24.sup.Suprova;


public class Student extends Suprova{
    
    private int studentId;

    public Student() {
    }

    public Student(int studentId) {
        this.studentId = studentId;
    }

    public Student(int studentId, String name, int age) {
        super(name, age);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + '}';
    }

    @Override
    public String details() {
        return (super.details()+ "\n"+studentId); 
    }
    
    
}
